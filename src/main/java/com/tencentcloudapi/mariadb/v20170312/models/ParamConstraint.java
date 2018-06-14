package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ParamConstraint  extends AbstractModel{


    /**
    * 约束类型,如枚举enum，区间section
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 约束类型为enum时的可选值列表
    */
    @SerializedName("Enum")
    @Expose
    private String Enum;

    /**
    * 约束类型为section时的范围
    */
    @SerializedName("Range")
    @Expose
    private ConstraintRange Range;

    /**
     * 获取约束类型,如枚举enum，区间section
     * @return Type 约束类型,如枚举enum，区间section
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置约束类型,如枚举enum，区间section
     * @param Type 约束类型,如枚举enum，区间section
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取约束类型为enum时的可选值列表
     * @return Enum 约束类型为enum时的可选值列表
     */
    public String getEnum() {
        return this.Enum;
    }

    /**
     * 设置约束类型为enum时的可选值列表
     * @param Enum 约束类型为enum时的可选值列表
     */
    public void setEnum(String Enum) {
        this.Enum = Enum;
    }

    /**
     * 获取约束类型为section时的范围
     * @return Range 约束类型为section时的范围
     */
    public ConstraintRange getRange() {
        return this.Range;
    }

    /**
     * 设置约束类型为section时的范围
     * @param Range 约束类型为section时的范围
     */
    public void setRange(ConstraintRange Range) {
        this.Range = Range;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Enum", this.Enum);
        this.setParamObj(map, prefix + "Range.", this.Range);

    }
}

