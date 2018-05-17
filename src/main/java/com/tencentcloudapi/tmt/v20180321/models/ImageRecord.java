package com.tencentcloudapi.tmt.v20180321.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ImageRecord  extends AbstractModel{


    /**
    * 图片翻译结果
    */
    @SerializedName("Value")
    @Expose
    private ItemValue [] Value;
    

    /**
     * 获取图片翻译结果
     * @return Value 图片翻译结果
     */
    public ItemValue [] getValue() {
        return this.Value;
    }

    /**
     * 设置图片翻译结果
     * @param Value 图片翻译结果
     */
    public void setValue(ItemValue [] Value) {
        this.Value = Value;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Value.", this.Value);

    }
}

