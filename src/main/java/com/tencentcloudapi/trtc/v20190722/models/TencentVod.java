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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TencentVod extends AbstractModel{

    /**
    * 媒体后续任务处理操作，即完成媒体上传后，可自动发起任务流操作。参数值为任务流模板名，云点播支持 创建任务流模板 并为模板命名。
    */
    @SerializedName("Procedure")
    @Expose
    private String Procedure;

    /**
    * 媒体文件过期时间，为当前时间的绝对过期时间；保存一天，就填"86400"，永久保存就填"0"，默认永久保存。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 指定上传园区，仅适用于对上传地域有特殊需求的用户。
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * 分类ID，用于对媒体进行分类管理，可通过 创建分类 接口，创建分类，获得分类 ID。
默认值：0，表示其他分类。
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * 点播 子应用 ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 任务流上下文，任务完成回调时透传。
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 上传上下文，上传完成回调时透传。
    */
    @SerializedName("SourceContext")
    @Expose
    private String SourceContext;

    /**
     * Get 媒体后续任务处理操作，即完成媒体上传后，可自动发起任务流操作。参数值为任务流模板名，云点播支持 创建任务流模板 并为模板命名。 
     * @return Procedure 媒体后续任务处理操作，即完成媒体上传后，可自动发起任务流操作。参数值为任务流模板名，云点播支持 创建任务流模板 并为模板命名。
     */
    public String getProcedure() {
        return this.Procedure;
    }

    /**
     * Set 媒体后续任务处理操作，即完成媒体上传后，可自动发起任务流操作。参数值为任务流模板名，云点播支持 创建任务流模板 并为模板命名。
     * @param Procedure 媒体后续任务处理操作，即完成媒体上传后，可自动发起任务流操作。参数值为任务流模板名，云点播支持 创建任务流模板 并为模板命名。
     */
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
    }

    /**
     * Get 媒体文件过期时间，为当前时间的绝对过期时间；保存一天，就填"86400"，永久保存就填"0"，默认永久保存。 
     * @return ExpireTime 媒体文件过期时间，为当前时间的绝对过期时间；保存一天，就填"86400"，永久保存就填"0"，默认永久保存。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 媒体文件过期时间，为当前时间的绝对过期时间；保存一天，就填"86400"，永久保存就填"0"，默认永久保存。
     * @param ExpireTime 媒体文件过期时间，为当前时间的绝对过期时间；保存一天，就填"86400"，永久保存就填"0"，默认永久保存。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 指定上传园区，仅适用于对上传地域有特殊需求的用户。 
     * @return StorageRegion 指定上传园区，仅适用于对上传地域有特殊需求的用户。
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set 指定上传园区，仅适用于对上传地域有特殊需求的用户。
     * @param StorageRegion 指定上传园区，仅适用于对上传地域有特殊需求的用户。
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get 分类ID，用于对媒体进行分类管理，可通过 创建分类 接口，创建分类，获得分类 ID。
默认值：0，表示其他分类。 
     * @return ClassId 分类ID，用于对媒体进行分类管理，可通过 创建分类 接口，创建分类，获得分类 ID。
默认值：0，表示其他分类。
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set 分类ID，用于对媒体进行分类管理，可通过 创建分类 接口，创建分类，获得分类 ID。
默认值：0，表示其他分类。
     * @param ClassId 分类ID，用于对媒体进行分类管理，可通过 创建分类 接口，创建分类，获得分类 ID。
默认值：0，表示其他分类。
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get 点播 子应用 ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。 
     * @return SubAppId 点播 子应用 ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播 子应用 ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播 子应用 ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 任务流上下文，任务完成回调时透传。 
     * @return SessionContext 任务流上下文，任务完成回调时透传。
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 任务流上下文，任务完成回调时透传。
     * @param SessionContext 任务流上下文，任务完成回调时透传。
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get 上传上下文，上传完成回调时透传。 
     * @return SourceContext 上传上下文，上传完成回调时透传。
     */
    public String getSourceContext() {
        return this.SourceContext;
    }

    /**
     * Set 上传上下文，上传完成回调时透传。
     * @param SourceContext 上传上下文，上传完成回调时透传。
     */
    public void setSourceContext(String SourceContext) {
        this.SourceContext = SourceContext;
    }

    public TencentVod() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TencentVod(TencentVod source) {
        if (source.Procedure != null) {
            this.Procedure = new String(source.Procedure);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.SourceContext != null) {
            this.SourceContext = new String(source.SourceContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Procedure", this.Procedure);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SourceContext", this.SourceContext);

    }
}

