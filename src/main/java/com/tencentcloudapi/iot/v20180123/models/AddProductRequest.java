package com.tencentcloudapi.iot.v20180123.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class AddProductRequest  extends AbstractModel{


    /**
    * 产品名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;
    

    /**
    * 产品描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;
    

    /**
    * 产品鉴权类型（0：直连，1：动态令牌），推荐使用动态令牌
    */
    @SerializedName("AuthType")
    @Expose
    private Integer AuthType;
    

    /**
    * 数据模版（json数组）
    */
    @SerializedName("DataTemplate")
    @Expose
    private String [] DataTemplate;
    

    /**
     * 获取产品名称
     * @return Name 产品名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置产品名称
     * @param Name 产品名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取产品描述
     * @return Description 产品描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置产品描述
     * @param Description 产品描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取产品鉴权类型（0：直连，1：动态令牌），推荐使用动态令牌
     * @return AuthType 产品鉴权类型（0：直连，1：动态令牌），推荐使用动态令牌
     */
    public Integer getAuthType() {
        return this.AuthType;
    }

    /**
     * 设置产品鉴权类型（0：直连，1：动态令牌），推荐使用动态令牌
     * @param AuthType 产品鉴权类型（0：直连，1：动态令牌），推荐使用动态令牌
     */
    public void setAuthType(Integer AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * 获取数据模版（json数组）
     * @return DataTemplate 数据模版（json数组）
     */
    public String [] getDataTemplate() {
        return this.DataTemplate;
    }

    /**
     * 设置数据模版（json数组）
     * @param DataTemplate 数据模版（json数组）
     */
    public void setDataTemplate(String [] DataTemplate) {
        this.DataTemplate = DataTemplate;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamArraySimple(map, prefix + "DataTemplate.", this.DataTemplate);

    }
}

