package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeBinlogsRequest  extends AbstractModel{


    /**
    * 实例ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;
    

    /**
    * 偏移量，最小值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;
    

    /**
    * 单次请求返回的数量，默认值为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;
    

    /**
     * 获取实例ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
     * @return InstanceId 实例ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
     * @param InstanceId 实例ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取偏移量，最小值为0。
     * @return Offset 偏移量，最小值为0。
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量，最小值为0。
     * @param Offset 偏移量，最小值为0。
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取单次请求返回的数量，默认值为20，最大值为100。
     * @return Limit 单次请求返回的数量，默认值为20，最大值为100。
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置单次请求返回的数量，默认值为20，最大值为100。
     * @param Limit 单次请求返回的数量，默认值为20，最大值为100。
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

