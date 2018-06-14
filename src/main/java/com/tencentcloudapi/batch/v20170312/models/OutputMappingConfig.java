package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class OutputMappingConfig  extends AbstractModel{


    /**
    * 存储类型，仅支持COS
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * 并行worker数量
    */
    @SerializedName("WorkerNum")
    @Expose
    private Integer WorkerNum;

    /**
    * worker分块大小
    */
    @SerializedName("WorkerPartSize")
    @Expose
    private Integer WorkerPartSize;

    /**
     * 获取存储类型，仅支持COS
     * @return Scene 存储类型，仅支持COS
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * 设置存储类型，仅支持COS
     * @param Scene 存储类型，仅支持COS
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * 获取并行worker数量
     * @return WorkerNum 并行worker数量
     */
    public Integer getWorkerNum() {
        return this.WorkerNum;
    }

    /**
     * 设置并行worker数量
     * @param WorkerNum 并行worker数量
     */
    public void setWorkerNum(Integer WorkerNum) {
        this.WorkerNum = WorkerNum;
    }

    /**
     * 获取worker分块大小
     * @return WorkerPartSize worker分块大小
     */
    public Integer getWorkerPartSize() {
        return this.WorkerPartSize;
    }

    /**
     * 设置worker分块大小
     * @param WorkerPartSize worker分块大小
     */
    public void setWorkerPartSize(Integer WorkerPartSize) {
        this.WorkerPartSize = WorkerPartSize;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "WorkerNum", this.WorkerNum);
        this.setParamSimple(map, prefix + "WorkerPartSize", this.WorkerPartSize);

    }
}

