package com.test.erp.dao.model;

import java.io.Serializable;

public class BossPopedom implements Serializable {
    /**
     * 主键编号
     *
     * @mbg.generated
     */
    private String id;

    /**
     * 权限名称
     *
     * @mbg.generated
     */
    private String popedomName;

    /**
     * 权限类型：BUTTON/MENU/FILE/ELEMENT
     *
     * @mbg.generated
     */
    private String popedomType;

    /**
     * 菜单权限地址
     *
     * @mbg.generated
     */
    private String url;

    /**
     * 权限等级
     *
     * @mbg.generated
     */
    private Byte lv;

    /**
     * 父级编号
     *
     * @mbg.generated
     */
    private String parentId;

    /**
     * 权限代码
     *
     * @mbg.generated
     */
    private String code;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPopedomName() {
        return popedomName;
    }

    public void setPopedomName(String popedomName) {
        this.popedomName = popedomName;
    }

    public String getPopedomType() {
        return popedomType;
    }

    public void setPopedomType(String popedomType) {
        this.popedomType = popedomType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Byte getLv() {
        return lv;
    }

    public void setLv(Byte lv) {
        this.lv = lv;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", popedomName=").append(popedomName);
        sb.append(", popedomType=").append(popedomType);
        sb.append(", url=").append(url);
        sb.append(", lv=").append(lv);
        sb.append(", parentId=").append(parentId);
        sb.append(", code=").append(code);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BossPopedom other = (BossPopedom) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPopedomName() == null ? other.getPopedomName() == null : this.getPopedomName().equals(other.getPopedomName()))
            && (this.getPopedomType() == null ? other.getPopedomType() == null : this.getPopedomType().equals(other.getPopedomType()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getLv() == null ? other.getLv() == null : this.getLv().equals(other.getLv()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPopedomName() == null) ? 0 : getPopedomName().hashCode());
        result = prime * result + ((getPopedomType() == null) ? 0 : getPopedomType().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getLv() == null) ? 0 : getLv().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        return result;
    }
}