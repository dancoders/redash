package com.dancoder.redash.dao.entity;

import lombok.Data;

import javax.persistence.Table;

/**
 * @author dancoder
 */
@Data
@Table(name = "alembic_version")
public class AlembicVersionDO {
    private String versionNum;
}
