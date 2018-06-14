package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class TagSpecification  extends AbstractModel{


    /**
    * 标签绑定的资源类型
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 标签对列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * 获取标签绑定的资源类型
     * @return ResourceType 标签绑定的资源类型
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * 设置标签绑定的资源类型
     * @param ResourceType 标签绑定的资源类型
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * 获取标签对列表
     * @return Tags 标签对列表
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * 设置标签对列表
     * @param Tags 标签对列表
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

