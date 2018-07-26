package com.tencentcloudapi.msp.v20180319.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ListMigrationProjectRequest  extends AbstractModel{


    /**
    * 记录起始数，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 返回条数，默认值为500
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
     * 获取记录起始数，默认值为0
     * @return Offset 记录起始数，默认值为0
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置记录起始数，默认值为0
     * @param Offset 记录起始数，默认值为0
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回条数，默认值为500
     * @return Limit 返回条数，默认值为500
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回条数，默认值为500
     * @param Limit 返回条数，默认值为500
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

