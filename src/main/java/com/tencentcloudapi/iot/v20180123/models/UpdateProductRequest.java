package com.tencentcloudapi.iot.v20180123.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class UpdateProductRequest  extends AbstractModel{


    /**
    * 产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;
    

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
    * 数据模版（json）
    */
    @SerializedName("DataTemplate")
    @Expose
    private String DataTemplate;
    

    /**
     * 获取产品Id
     * @return ProductId 产品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * 设置产品Id
     * @param ProductId 产品Id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

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
     * 获取数据模版（json）
     * @return DataTemplate 数据模版（json）
     */
    public String getDataTemplate() {
        return this.DataTemplate;
    }

    /**
     * 设置数据模版（json）
     * @param DataTemplate 数据模版（json）
     */
    public void setDataTemplate(String DataTemplate) {
        this.DataTemplate = DataTemplate;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DataTemplate", this.DataTemplate);

    }
}

