package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class FilterObject  extends AbstractModel{


    /**
    * 属性名称, 若存在多个Filter时，Filter间的关系为逻辑与（AND）关系。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 属性值, 若同一个Filter存在多个Values，同一Filter下Values间的关系为逻辑或（OR）关系。
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * 获取属性名称, 若存在多个Filter时，Filter间的关系为逻辑与（AND）关系。
     * @return Name 属性名称, 若存在多个Filter时，Filter间的关系为逻辑与（AND）关系。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置属性名称, 若存在多个Filter时，Filter间的关系为逻辑与（AND）关系。
     * @param Name 属性名称, 若存在多个Filter时，Filter间的关系为逻辑与（AND）关系。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取属性值, 若同一个Filter存在多个Values，同一Filter下Values间的关系为逻辑或（OR）关系。
     * @return Values 属性值, 若同一个Filter存在多个Values，同一Filter下Values间的关系为逻辑或（OR）关系。
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * 设置属性值, 若同一个Filter存在多个Values，同一Filter下Values间的关系为逻辑或（OR）关系。
     * @param Values 属性值, 若同一个Filter存在多个Values，同一Filter下Values间的关系为逻辑或（OR）关系。
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

