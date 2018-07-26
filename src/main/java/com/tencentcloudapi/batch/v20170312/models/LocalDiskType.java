package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class LocalDiskType  extends AbstractModel{


    /**
    * 本地磁盘类型。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 本地磁盘属性。
    */
    @SerializedName("PartitionType")
    @Expose
    private String PartitionType;

    /**
    * 本地磁盘最小值。
    */
    @SerializedName("MinSize")
    @Expose
    private Integer MinSize;

    /**
    * 本地磁盘最大值。
    */
    @SerializedName("MaxSize")
    @Expose
    private Integer MaxSize;

    /**
     * 获取本地磁盘类型。
     * @return Type 本地磁盘类型。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置本地磁盘类型。
     * @param Type 本地磁盘类型。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取本地磁盘属性。
     * @return PartitionType 本地磁盘属性。
     */
    public String getPartitionType() {
        return this.PartitionType;
    }

    /**
     * 设置本地磁盘属性。
     * @param PartitionType 本地磁盘属性。
     */
    public void setPartitionType(String PartitionType) {
        this.PartitionType = PartitionType;
    }

    /**
     * 获取本地磁盘最小值。
     * @return MinSize 本地磁盘最小值。
     */
    public Integer getMinSize() {
        return this.MinSize;
    }

    /**
     * 设置本地磁盘最小值。
     * @param MinSize 本地磁盘最小值。
     */
    public void setMinSize(Integer MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * 获取本地磁盘最大值。
     * @return MaxSize 本地磁盘最大值。
     */
    public Integer getMaxSize() {
        return this.MaxSize;
    }

    /**
     * 设置本地磁盘最大值。
     * @param MaxSize 本地磁盘最大值。
     */
    public void setMaxSize(Integer MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PartitionType", this.PartitionType);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);

    }
}

