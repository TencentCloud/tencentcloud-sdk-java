package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SellType  extends AbstractModel{


    /**
    * 售卖实例名称
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 内核版本号
    */
    @SerializedName("EngineVersion")
    @Expose
    private String [] EngineVersion;

    /**
    * 售卖规格详细配置
    */
    @SerializedName("Configs")
    @Expose
    private SellConfig [] Configs;

    /**
     * 获取售卖实例名称
     * @return TypeName 售卖实例名称
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * 设置售卖实例名称
     * @param TypeName 售卖实例名称
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * 获取内核版本号
     * @return EngineVersion 内核版本号
     */
    public String [] getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * 设置内核版本号
     * @param EngineVersion 内核版本号
     */
    public void setEngineVersion(String [] EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * 获取售卖规格详细配置
     * @return Configs 售卖规格详细配置
     */
    public SellConfig [] getConfigs() {
        return this.Configs;
    }

    /**
     * 设置售卖规格详细配置
     * @param Configs 售卖规格详细配置
     */
    public void setConfigs(SellConfig [] Configs) {
        this.Configs = Configs;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamArraySimple(map, prefix + "EngineVersion.", this.EngineVersion);
        this.setParamArrayObj(map, prefix + "Configs.", this.Configs);

    }
}

