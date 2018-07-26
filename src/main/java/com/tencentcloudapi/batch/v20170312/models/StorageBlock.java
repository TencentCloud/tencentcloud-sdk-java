package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class StorageBlock  extends AbstractModel{


    /**
    * HDD本地存储类型，值为：LOCAL_PRO.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * HDD本地存储的最小容量
    */
    @SerializedName("MinSize")
    @Expose
    private Integer MinSize;

    /**
    * HDD本地存储的最大容量
    */
    @SerializedName("MaxSize")
    @Expose
    private Integer MaxSize;

    /**
     * 获取HDD本地存储类型，值为：LOCAL_PRO.
     * @return Type HDD本地存储类型，值为：LOCAL_PRO.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置HDD本地存储类型，值为：LOCAL_PRO.
     * @param Type HDD本地存储类型，值为：LOCAL_PRO.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取HDD本地存储的最小容量
     * @return MinSize HDD本地存储的最小容量
     */
    public Integer getMinSize() {
        return this.MinSize;
    }

    /**
     * 设置HDD本地存储的最小容量
     * @param MinSize HDD本地存储的最小容量
     */
    public void setMinSize(Integer MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * 获取HDD本地存储的最大容量
     * @return MaxSize HDD本地存储的最大容量
     */
    public Integer getMaxSize() {
        return this.MaxSize;
    }

    /**
     * 设置HDD本地存储的最大容量
     * @param MaxSize HDD本地存储的最大容量
     */
    public void setMaxSize(Integer MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);

    }
}

