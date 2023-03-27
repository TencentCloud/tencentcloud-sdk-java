/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WhiteboardApplicationConfig extends AbstractModel{

    /**
    * 任务类型

recording: 实时录制
transcode: 文档转码
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 存储桶名字
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 存储桶地域
    */
    @SerializedName("BucketLocation")
    @Expose
    private String BucketLocation;

    /**
    * 资源在存储桶中的前缀
    */
    @SerializedName("BucketPrefix")
    @Expose
    private String BucketPrefix;

    /**
    * 目标CDN域名
    */
    @SerializedName("ResultDomain")
    @Expose
    private String ResultDomain;

    /**
    * 回调地址
    */
    @SerializedName("Callback")
    @Expose
    private String Callback;

    /**
    * 回调鉴权密钥
    */
    @SerializedName("CallbackKey")
    @Expose
    private String CallbackKey;

    /**
    * 配置的应用SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * IM管理员UserId
    */
    @SerializedName("AdminUserId")
    @Expose
    private String AdminUserId;

    /**
    * IM管理员UserSig
    */
    @SerializedName("AdminUserSig")
    @Expose
    private String AdminUserSig;

    /**
     * Get 任务类型

recording: 实时录制
transcode: 文档转码 
     * @return TaskType 任务类型

recording: 实时录制
transcode: 文档转码
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型

recording: 实时录制
transcode: 文档转码
     * @param TaskType 任务类型

recording: 实时录制
transcode: 文档转码
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 存储桶名字 
     * @return BucketName 存储桶名字
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 存储桶名字
     * @param BucketName 存储桶名字
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 存储桶地域 
     * @return BucketLocation 存储桶地域
     */
    public String getBucketLocation() {
        return this.BucketLocation;
    }

    /**
     * Set 存储桶地域
     * @param BucketLocation 存储桶地域
     */
    public void setBucketLocation(String BucketLocation) {
        this.BucketLocation = BucketLocation;
    }

    /**
     * Get 资源在存储桶中的前缀 
     * @return BucketPrefix 资源在存储桶中的前缀
     */
    public String getBucketPrefix() {
        return this.BucketPrefix;
    }

    /**
     * Set 资源在存储桶中的前缀
     * @param BucketPrefix 资源在存储桶中的前缀
     */
    public void setBucketPrefix(String BucketPrefix) {
        this.BucketPrefix = BucketPrefix;
    }

    /**
     * Get 目标CDN域名 
     * @return ResultDomain 目标CDN域名
     */
    public String getResultDomain() {
        return this.ResultDomain;
    }

    /**
     * Set 目标CDN域名
     * @param ResultDomain 目标CDN域名
     */
    public void setResultDomain(String ResultDomain) {
        this.ResultDomain = ResultDomain;
    }

    /**
     * Get 回调地址 
     * @return Callback 回调地址
     */
    public String getCallback() {
        return this.Callback;
    }

    /**
     * Set 回调地址
     * @param Callback 回调地址
     */
    public void setCallback(String Callback) {
        this.Callback = Callback;
    }

    /**
     * Get 回调鉴权密钥 
     * @return CallbackKey 回调鉴权密钥
     */
    public String getCallbackKey() {
        return this.CallbackKey;
    }

    /**
     * Set 回调鉴权密钥
     * @param CallbackKey 回调鉴权密钥
     */
    public void setCallbackKey(String CallbackKey) {
        this.CallbackKey = CallbackKey;
    }

    /**
     * Get 配置的应用SdkAppId 
     * @return SdkAppId 配置的应用SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 配置的应用SdkAppId
     * @param SdkAppId 配置的应用SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get IM管理员UserId 
     * @return AdminUserId IM管理员UserId
     */
    public String getAdminUserId() {
        return this.AdminUserId;
    }

    /**
     * Set IM管理员UserId
     * @param AdminUserId IM管理员UserId
     */
    public void setAdminUserId(String AdminUserId) {
        this.AdminUserId = AdminUserId;
    }

    /**
     * Get IM管理员UserSig 
     * @return AdminUserSig IM管理员UserSig
     */
    public String getAdminUserSig() {
        return this.AdminUserSig;
    }

    /**
     * Set IM管理员UserSig
     * @param AdminUserSig IM管理员UserSig
     */
    public void setAdminUserSig(String AdminUserSig) {
        this.AdminUserSig = AdminUserSig;
    }

    public WhiteboardApplicationConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WhiteboardApplicationConfig(WhiteboardApplicationConfig source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.BucketLocation != null) {
            this.BucketLocation = new String(source.BucketLocation);
        }
        if (source.BucketPrefix != null) {
            this.BucketPrefix = new String(source.BucketPrefix);
        }
        if (source.ResultDomain != null) {
            this.ResultDomain = new String(source.ResultDomain);
        }
        if (source.Callback != null) {
            this.Callback = new String(source.Callback);
        }
        if (source.CallbackKey != null) {
            this.CallbackKey = new String(source.CallbackKey);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.AdminUserId != null) {
            this.AdminUserId = new String(source.AdminUserId);
        }
        if (source.AdminUserSig != null) {
            this.AdminUserSig = new String(source.AdminUserSig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketLocation", this.BucketLocation);
        this.setParamSimple(map, prefix + "BucketPrefix", this.BucketPrefix);
        this.setParamSimple(map, prefix + "ResultDomain", this.ResultDomain);
        this.setParamSimple(map, prefix + "Callback", this.Callback);
        this.setParamSimple(map, prefix + "CallbackKey", this.CallbackKey);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "AdminUserId", this.AdminUserId);
        this.setParamSimple(map, prefix + "AdminUserSig", this.AdminUserSig);

    }
}

