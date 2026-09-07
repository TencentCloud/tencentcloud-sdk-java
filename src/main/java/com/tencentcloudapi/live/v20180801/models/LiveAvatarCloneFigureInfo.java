/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveAvatarCloneFigureInfo extends AbstractModel {

    /**
    * <p>克隆形象任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>场景模式</p><p>枚举值：</p><ul><li>PHOTO： 图生形象</li><li>GREEN_SCREEN： 绿幕形象</li><li>REAL_SHOT： 实景形象</li></ul>
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * <p>形象名称</p>
    */
    @SerializedName("FigureName")
    @Expose
    private String FigureName;

    /**
    * <p>性别：男或者女</p>
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * <p>状态</p><p>枚举值：</p><ul><li>SUCCESS： 成功</li><li>FAILED： 失败</li><li>PROCESSING： 生成中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>进度条</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>克隆好的形象在系统的key</p>
    */
    @SerializedName("AvatarKey")
    @Expose
    private String AvatarKey;

    /**
    * <p>形象的图像</p>
    */
    @SerializedName("FigureImg")
    @Expose
    private String FigureImg;

    /**
    * <p>失败原因，成功时，该字段没值</p>
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * <p>训练视频</p>
    */
    @SerializedName("MaterialUrl")
    @Expose
    private String MaterialUrl;

    /**
    * <p>该克隆音色创建的时间</p><p>参数格式：YYYY-MM-DD</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p><p>参数格式：YYYY-MM</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>是否有续期</p>
    */
    @SerializedName("RenewStatus")
    @Expose
    private String RenewStatus;

    /**
    * <p>是否过期</p>
    */
    @SerializedName("IsExpired")
    @Expose
    private Boolean IsExpired;

    /**
    * <p>有效期时间</p><p>参数格式：YYYY-MM</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>是否循环播放(实景克隆形象能使用)</p>
    */
    @SerializedName("NeedPlayback")
    @Expose
    private Long NeedPlayback;

    /**
    * <p>训练幅度，0：表示只有有头部动；1表示头部和手势都有训练</p><p>单位：1</p>
    */
    @SerializedName("PhotoVersion")
    @Expose
    private Long PhotoVersion;

    /**
    * <p>待确认视频</p>
    */
    @SerializedName("ConfirmDemoUrls")
    @Expose
    private String ConfirmDemoUrls;

    /**
    * <p>形象克隆完成时间</p><p>参数格式：YYYY-MM</p>
    */
    @SerializedName("EstimatedCompleteTime")
    @Expose
    private String EstimatedCompleteTime;

    /**
     * Get <p>克隆形象任务ID</p> 
     * @return TaskId <p>克隆形象任务ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>克隆形象任务ID</p>
     * @param TaskId <p>克隆形象任务ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>场景模式</p><p>枚举值：</p><ul><li>PHOTO： 图生形象</li><li>GREEN_SCREEN： 绿幕形象</li><li>REAL_SHOT： 实景形象</li></ul> 
     * @return SceneType <p>场景模式</p><p>枚举值：</p><ul><li>PHOTO： 图生形象</li><li>GREEN_SCREEN： 绿幕形象</li><li>REAL_SHOT： 实景形象</li></ul>
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>场景模式</p><p>枚举值：</p><ul><li>PHOTO： 图生形象</li><li>GREEN_SCREEN： 绿幕形象</li><li>REAL_SHOT： 实景形象</li></ul>
     * @param SceneType <p>场景模式</p><p>枚举值：</p><ul><li>PHOTO： 图生形象</li><li>GREEN_SCREEN： 绿幕形象</li><li>REAL_SHOT： 实景形象</li></ul>
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p>形象名称</p> 
     * @return FigureName <p>形象名称</p>
     */
    public String getFigureName() {
        return this.FigureName;
    }

    /**
     * Set <p>形象名称</p>
     * @param FigureName <p>形象名称</p>
     */
    public void setFigureName(String FigureName) {
        this.FigureName = FigureName;
    }

    /**
     * Get <p>性别：男或者女</p> 
     * @return Gender <p>性别：男或者女</p>
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set <p>性别：男或者女</p>
     * @param Gender <p>性别：男或者女</p>
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get <p>状态</p><p>枚举值：</p><ul><li>SUCCESS： 成功</li><li>FAILED： 失败</li><li>PROCESSING： 生成中</li></ul> 
     * @return Status <p>状态</p><p>枚举值：</p><ul><li>SUCCESS： 成功</li><li>FAILED： 失败</li><li>PROCESSING： 生成中</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p><p>枚举值：</p><ul><li>SUCCESS： 成功</li><li>FAILED： 失败</li><li>PROCESSING： 生成中</li></ul>
     * @param Status <p>状态</p><p>枚举值：</p><ul><li>SUCCESS： 成功</li><li>FAILED： 失败</li><li>PROCESSING： 生成中</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>进度条</p> 
     * @return Progress <p>进度条</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>进度条</p>
     * @param Progress <p>进度条</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>克隆好的形象在系统的key</p> 
     * @return AvatarKey <p>克隆好的形象在系统的key</p>
     */
    public String getAvatarKey() {
        return this.AvatarKey;
    }

    /**
     * Set <p>克隆好的形象在系统的key</p>
     * @param AvatarKey <p>克隆好的形象在系统的key</p>
     */
    public void setAvatarKey(String AvatarKey) {
        this.AvatarKey = AvatarKey;
    }

    /**
     * Get <p>形象的图像</p> 
     * @return FigureImg <p>形象的图像</p>
     */
    public String getFigureImg() {
        return this.FigureImg;
    }

    /**
     * Set <p>形象的图像</p>
     * @param FigureImg <p>形象的图像</p>
     */
    public void setFigureImg(String FigureImg) {
        this.FigureImg = FigureImg;
    }

    /**
     * Get <p>失败原因，成功时，该字段没值</p> 
     * @return FailReason <p>失败原因，成功时，该字段没值</p>
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set <p>失败原因，成功时，该字段没值</p>
     * @param FailReason <p>失败原因，成功时，该字段没值</p>
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get <p>训练视频</p> 
     * @return MaterialUrl <p>训练视频</p>
     */
    public String getMaterialUrl() {
        return this.MaterialUrl;
    }

    /**
     * Set <p>训练视频</p>
     * @param MaterialUrl <p>训练视频</p>
     */
    public void setMaterialUrl(String MaterialUrl) {
        this.MaterialUrl = MaterialUrl;
    }

    /**
     * Get <p>该克隆音色创建的时间</p><p>参数格式：YYYY-MM-DD</p> 
     * @return CreateTime <p>该克隆音色创建的时间</p><p>参数格式：YYYY-MM-DD</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>该克隆音色创建的时间</p><p>参数格式：YYYY-MM-DD</p>
     * @param CreateTime <p>该克隆音色创建的时间</p><p>参数格式：YYYY-MM-DD</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p><p>参数格式：YYYY-MM</p> 
     * @return UpdateTime <p>更新时间</p><p>参数格式：YYYY-MM</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p><p>参数格式：YYYY-MM</p>
     * @param UpdateTime <p>更新时间</p><p>参数格式：YYYY-MM</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>是否有续期</p> 
     * @return RenewStatus <p>是否有续期</p>
     */
    public String getRenewStatus() {
        return this.RenewStatus;
    }

    /**
     * Set <p>是否有续期</p>
     * @param RenewStatus <p>是否有续期</p>
     */
    public void setRenewStatus(String RenewStatus) {
        this.RenewStatus = RenewStatus;
    }

    /**
     * Get <p>是否过期</p> 
     * @return IsExpired <p>是否过期</p>
     */
    public Boolean getIsExpired() {
        return this.IsExpired;
    }

    /**
     * Set <p>是否过期</p>
     * @param IsExpired <p>是否过期</p>
     */
    public void setIsExpired(Boolean IsExpired) {
        this.IsExpired = IsExpired;
    }

    /**
     * Get <p>有效期时间</p><p>参数格式：YYYY-MM</p> 
     * @return ExpireTime <p>有效期时间</p><p>参数格式：YYYY-MM</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>有效期时间</p><p>参数格式：YYYY-MM</p>
     * @param ExpireTime <p>有效期时间</p><p>参数格式：YYYY-MM</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>是否循环播放(实景克隆形象能使用)</p> 
     * @return NeedPlayback <p>是否循环播放(实景克隆形象能使用)</p>
     */
    public Long getNeedPlayback() {
        return this.NeedPlayback;
    }

    /**
     * Set <p>是否循环播放(实景克隆形象能使用)</p>
     * @param NeedPlayback <p>是否循环播放(实景克隆形象能使用)</p>
     */
    public void setNeedPlayback(Long NeedPlayback) {
        this.NeedPlayback = NeedPlayback;
    }

    /**
     * Get <p>训练幅度，0：表示只有有头部动；1表示头部和手势都有训练</p><p>单位：1</p> 
     * @return PhotoVersion <p>训练幅度，0：表示只有有头部动；1表示头部和手势都有训练</p><p>单位：1</p>
     */
    public Long getPhotoVersion() {
        return this.PhotoVersion;
    }

    /**
     * Set <p>训练幅度，0：表示只有有头部动；1表示头部和手势都有训练</p><p>单位：1</p>
     * @param PhotoVersion <p>训练幅度，0：表示只有有头部动；1表示头部和手势都有训练</p><p>单位：1</p>
     */
    public void setPhotoVersion(Long PhotoVersion) {
        this.PhotoVersion = PhotoVersion;
    }

    /**
     * Get <p>待确认视频</p> 
     * @return ConfirmDemoUrls <p>待确认视频</p>
     */
    public String getConfirmDemoUrls() {
        return this.ConfirmDemoUrls;
    }

    /**
     * Set <p>待确认视频</p>
     * @param ConfirmDemoUrls <p>待确认视频</p>
     */
    public void setConfirmDemoUrls(String ConfirmDemoUrls) {
        this.ConfirmDemoUrls = ConfirmDemoUrls;
    }

    /**
     * Get <p>形象克隆完成时间</p><p>参数格式：YYYY-MM</p> 
     * @return EstimatedCompleteTime <p>形象克隆完成时间</p><p>参数格式：YYYY-MM</p>
     */
    public String getEstimatedCompleteTime() {
        return this.EstimatedCompleteTime;
    }

    /**
     * Set <p>形象克隆完成时间</p><p>参数格式：YYYY-MM</p>
     * @param EstimatedCompleteTime <p>形象克隆完成时间</p><p>参数格式：YYYY-MM</p>
     */
    public void setEstimatedCompleteTime(String EstimatedCompleteTime) {
        this.EstimatedCompleteTime = EstimatedCompleteTime;
    }

    public LiveAvatarCloneFigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveAvatarCloneFigureInfo(LiveAvatarCloneFigureInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SceneType != null) {
            this.SceneType = new String(source.SceneType);
        }
        if (source.FigureName != null) {
            this.FigureName = new String(source.FigureName);
        }
        if (source.Gender != null) {
            this.Gender = new String(source.Gender);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.AvatarKey != null) {
            this.AvatarKey = new String(source.AvatarKey);
        }
        if (source.FigureImg != null) {
            this.FigureImg = new String(source.FigureImg);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.MaterialUrl != null) {
            this.MaterialUrl = new String(source.MaterialUrl);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RenewStatus != null) {
            this.RenewStatus = new String(source.RenewStatus);
        }
        if (source.IsExpired != null) {
            this.IsExpired = new Boolean(source.IsExpired);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.NeedPlayback != null) {
            this.NeedPlayback = new Long(source.NeedPlayback);
        }
        if (source.PhotoVersion != null) {
            this.PhotoVersion = new Long(source.PhotoVersion);
        }
        if (source.ConfirmDemoUrls != null) {
            this.ConfirmDemoUrls = new String(source.ConfirmDemoUrls);
        }
        if (source.EstimatedCompleteTime != null) {
            this.EstimatedCompleteTime = new String(source.EstimatedCompleteTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "FigureName", this.FigureName);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "AvatarKey", this.AvatarKey);
        this.setParamSimple(map, prefix + "FigureImg", this.FigureImg);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "MaterialUrl", this.MaterialUrl);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RenewStatus", this.RenewStatus);
        this.setParamSimple(map, prefix + "IsExpired", this.IsExpired);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "NeedPlayback", this.NeedPlayback);
        this.setParamSimple(map, prefix + "PhotoVersion", this.PhotoVersion);
        this.setParamSimple(map, prefix + "ConfirmDemoUrls", this.ConfirmDemoUrls);
        this.setParamSimple(map, prefix + "EstimatedCompleteTime", this.EstimatedCompleteTime);

    }
}

