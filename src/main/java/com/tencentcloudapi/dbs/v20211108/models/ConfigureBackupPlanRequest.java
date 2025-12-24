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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigureBackupPlanRequest extends AbstractModel {

    /**
    * 备份计划 ID。
    */
    @SerializedName("BackupPlanId")
    @Expose
    private String BackupPlanId;

    /**
    * 备份计划名称。支持数字、英文大小写字母、中文以及特殊字符_-./()（）[]+=：:@,且长度不能超过60。
    */
    @SerializedName("BackupPlanName")
    @Expose
    private String BackupPlanName;

    /**
    * 全量备份并发数上限。
    */
    @SerializedName("UpperParallel")
    @Expose
    private Long UpperParallel;

    /**
    * 备份源实例信息。
    */
    @SerializedName("SourceEndPoint")
    @Expose
    private BackupEndpoint SourceEndPoint;

    /**
    * 备份对象信息。
    */
    @SerializedName("BackupObject")
    @Expose
    private BackupObject BackupObject;

    /**
    * 备份策略。
    */
    @SerializedName("BackupStrategy")
    @Expose
    private BackupStrategy BackupStrategy;

    /**
    * 加密信息。当需要使用SSE-KMS需要传入该值，你可以通过 KMS 的 GenerateDataKey 接口生成。
    */
    @SerializedName("PlainText")
    @Expose
    private String PlainText;

    /**
     * Get 备份计划 ID。 
     * @return BackupPlanId 备份计划 ID。
     */
    public String getBackupPlanId() {
        return this.BackupPlanId;
    }

    /**
     * Set 备份计划 ID。
     * @param BackupPlanId 备份计划 ID。
     */
    public void setBackupPlanId(String BackupPlanId) {
        this.BackupPlanId = BackupPlanId;
    }

    /**
     * Get 备份计划名称。支持数字、英文大小写字母、中文以及特殊字符_-./()（）[]+=：:@,且长度不能超过60。 
     * @return BackupPlanName 备份计划名称。支持数字、英文大小写字母、中文以及特殊字符_-./()（）[]+=：:@,且长度不能超过60。
     */
    public String getBackupPlanName() {
        return this.BackupPlanName;
    }

    /**
     * Set 备份计划名称。支持数字、英文大小写字母、中文以及特殊字符_-./()（）[]+=：:@,且长度不能超过60。
     * @param BackupPlanName 备份计划名称。支持数字、英文大小写字母、中文以及特殊字符_-./()（）[]+=：:@,且长度不能超过60。
     */
    public void setBackupPlanName(String BackupPlanName) {
        this.BackupPlanName = BackupPlanName;
    }

    /**
     * Get 全量备份并发数上限。 
     * @return UpperParallel 全量备份并发数上限。
     */
    public Long getUpperParallel() {
        return this.UpperParallel;
    }

    /**
     * Set 全量备份并发数上限。
     * @param UpperParallel 全量备份并发数上限。
     */
    public void setUpperParallel(Long UpperParallel) {
        this.UpperParallel = UpperParallel;
    }

    /**
     * Get 备份源实例信息。 
     * @return SourceEndPoint 备份源实例信息。
     */
    public BackupEndpoint getSourceEndPoint() {
        return this.SourceEndPoint;
    }

    /**
     * Set 备份源实例信息。
     * @param SourceEndPoint 备份源实例信息。
     */
    public void setSourceEndPoint(BackupEndpoint SourceEndPoint) {
        this.SourceEndPoint = SourceEndPoint;
    }

    /**
     * Get 备份对象信息。 
     * @return BackupObject 备份对象信息。
     */
    public BackupObject getBackupObject() {
        return this.BackupObject;
    }

    /**
     * Set 备份对象信息。
     * @param BackupObject 备份对象信息。
     */
    public void setBackupObject(BackupObject BackupObject) {
        this.BackupObject = BackupObject;
    }

    /**
     * Get 备份策略。 
     * @return BackupStrategy 备份策略。
     */
    public BackupStrategy getBackupStrategy() {
        return this.BackupStrategy;
    }

    /**
     * Set 备份策略。
     * @param BackupStrategy 备份策略。
     */
    public void setBackupStrategy(BackupStrategy BackupStrategy) {
        this.BackupStrategy = BackupStrategy;
    }

    /**
     * Get 加密信息。当需要使用SSE-KMS需要传入该值，你可以通过 KMS 的 GenerateDataKey 接口生成。 
     * @return PlainText 加密信息。当需要使用SSE-KMS需要传入该值，你可以通过 KMS 的 GenerateDataKey 接口生成。
     */
    public String getPlainText() {
        return this.PlainText;
    }

    /**
     * Set 加密信息。当需要使用SSE-KMS需要传入该值，你可以通过 KMS 的 GenerateDataKey 接口生成。
     * @param PlainText 加密信息。当需要使用SSE-KMS需要传入该值，你可以通过 KMS 的 GenerateDataKey 接口生成。
     */
    public void setPlainText(String PlainText) {
        this.PlainText = PlainText;
    }

    public ConfigureBackupPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigureBackupPlanRequest(ConfigureBackupPlanRequest source) {
        if (source.BackupPlanId != null) {
            this.BackupPlanId = new String(source.BackupPlanId);
        }
        if (source.BackupPlanName != null) {
            this.BackupPlanName = new String(source.BackupPlanName);
        }
        if (source.UpperParallel != null) {
            this.UpperParallel = new Long(source.UpperParallel);
        }
        if (source.SourceEndPoint != null) {
            this.SourceEndPoint = new BackupEndpoint(source.SourceEndPoint);
        }
        if (source.BackupObject != null) {
            this.BackupObject = new BackupObject(source.BackupObject);
        }
        if (source.BackupStrategy != null) {
            this.BackupStrategy = new BackupStrategy(source.BackupStrategy);
        }
        if (source.PlainText != null) {
            this.PlainText = new String(source.PlainText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupPlanId", this.BackupPlanId);
        this.setParamSimple(map, prefix + "BackupPlanName", this.BackupPlanName);
        this.setParamSimple(map, prefix + "UpperParallel", this.UpperParallel);
        this.setParamObj(map, prefix + "SourceEndPoint.", this.SourceEndPoint);
        this.setParamObj(map, prefix + "BackupObject.", this.BackupObject);
        this.setParamObj(map, prefix + "BackupStrategy.", this.BackupStrategy);
        this.setParamSimple(map, prefix + "PlainText", this.PlainText);

    }
}

