package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DeleteImagesRequest  extends AbstractModel{


    /**
    * 准备删除的镜像Id列表
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;
    

    /**
     * 获取准备删除的镜像Id列表
     * @return ImageIds 准备删除的镜像Id列表
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * 设置准备删除的镜像Id列表
     * @param ImageIds 准备删除的镜像Id列表
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);

    }
}

