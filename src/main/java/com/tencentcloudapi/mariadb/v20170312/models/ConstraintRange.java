package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ConstraintRange  extends AbstractModel{


    /**
    * 约束类型为section时的最小值
    */
    @SerializedName("Min")
    @Expose
    private String Min;
    

    /**
    * 约束类型为section时的最大值
    */
    @SerializedName("Max")
    @Expose
    private String Max;
    

    /**
     * 获取约束类型为section时的最小值
     * @return Min 约束类型为section时的最小值
     */
    public String getMin() {
        return this.Min;
    }

    /**
     * 设置约束类型为section时的最小值
     * @param Min 约束类型为section时的最小值
     */
    public void setMin(String Min) {
        this.Min = Min;
    }

    /**
     * 获取约束类型为section时的最大值
     * @return Max 约束类型为section时的最大值
     */
    public String getMax() {
        return this.Max;
    }

    /**
     * 设置约束类型为section时的最大值
     * @param Max 约束类型为section时的最大值
     */
    public void setMax(String Max) {
        this.Max = Max;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "Max", this.Max);

    }
}

