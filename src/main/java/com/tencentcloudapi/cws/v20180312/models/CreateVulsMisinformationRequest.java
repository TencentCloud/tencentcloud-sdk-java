package com.tencentcloudapi.cws.v20180312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateVulsMisinformationRequest  extends AbstractModel{


    /**
    * 漏洞ID列表
    */
    @SerializedName("VulIds")
    @Expose
    private Integer [] VulIds;

    /**
     * 获取漏洞ID列表
     * @return VulIds 漏洞ID列表
     */
    public Integer [] getVulIds() {
        return this.VulIds;
    }

    /**
     * 设置漏洞ID列表
     * @param VulIds 漏洞ID列表
     */
    public void setVulIds(Integer [] VulIds) {
        this.VulIds = VulIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VulIds.", this.VulIds);

    }
}

