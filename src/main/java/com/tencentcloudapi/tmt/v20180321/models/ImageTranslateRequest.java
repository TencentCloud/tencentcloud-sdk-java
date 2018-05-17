package com.tencentcloudapi.tmt.v20180321.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ImageTranslateRequest  extends AbstractModel{


    /**
    * 唯一id，返回时原样返回
    */
    @SerializedName("SessionUuid")
    @Expose
    private String SessionUuid;
    

    /**
    * doc:文档扫描
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;
    

    /**
    * 图片数据的Base64字符串
    */
    @SerializedName("Data")
    @Expose
    private String Data;
    

    /**
    * 源语言，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
    */
    @SerializedName("Source")
    @Expose
    private String Source;
    

    /**
    * 目标语言，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
    */
    @SerializedName("Target")
    @Expose
    private String Target;
    

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;
    

    /**
     * 获取唯一id，返回时原样返回
     * @return SessionUuid 唯一id，返回时原样返回
     */
    public String getSessionUuid() {
        return this.SessionUuid;
    }

    /**
     * 设置唯一id，返回时原样返回
     * @param SessionUuid 唯一id，返回时原样返回
     */
    public void setSessionUuid(String SessionUuid) {
        this.SessionUuid = SessionUuid;
    }

    /**
     * 获取doc:文档扫描
     * @return Scene doc:文档扫描
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * 设置doc:文档扫描
     * @param Scene doc:文档扫描
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * 获取图片数据的Base64字符串
     * @return Data 图片数据的Base64字符串
     */
    public String getData() {
        return this.Data;
    }

    /**
     * 设置图片数据的Base64字符串
     * @param Data 图片数据的Base64字符串
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * 获取源语言，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     * @return Source 源语言，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * 设置源语言，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     * @param Source 源语言，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * 获取目标语言，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     * @return Target 目标语言，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * 设置目标语言，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     * @param Target 目标语言，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * 获取项目id
     * @return ProjectId 项目id
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionUuid", this.SessionUuid);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

