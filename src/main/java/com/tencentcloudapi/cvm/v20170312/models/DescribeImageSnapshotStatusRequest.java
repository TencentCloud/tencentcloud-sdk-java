package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeImageSnapshotStatusRequest  extends AbstractModel{


    /**
    * 需要查看的镜像Id
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;
    

    /**
     * 获取需要查看的镜像Id
     * @return ImageId 需要查看的镜像Id
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * 设置需要查看的镜像Id
     * @param ImageId 需要查看的镜像Id
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);

    }
}

