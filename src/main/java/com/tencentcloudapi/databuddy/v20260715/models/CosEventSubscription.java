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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosEventSubscription extends AbstractModel {

    /**
    * CKafka 实例 ID，例如 ckafka-xxxxxxxx（订阅时必填）
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * CKafka 主题名称（订阅时必填）
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 服务角色名称，例如 COSNotifyRole（订阅时必填；服务端按当前租户拼接完整 ARN）
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * COS 存储桶所在地域，例如 ap-guangzhou（订阅时必填；过渡方案，后续可能改为服务端自动解析并移除）
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get CKafka 实例 ID，例如 ckafka-xxxxxxxx（订阅时必填） 
     * @return InstanceId CKafka 实例 ID，例如 ckafka-xxxxxxxx（订阅时必填）
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set CKafka 实例 ID，例如 ckafka-xxxxxxxx（订阅时必填）
     * @param InstanceId CKafka 实例 ID，例如 ckafka-xxxxxxxx（订阅时必填）
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get CKafka 主题名称（订阅时必填） 
     * @return TopicName CKafka 主题名称（订阅时必填）
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set CKafka 主题名称（订阅时必填）
     * @param TopicName CKafka 主题名称（订阅时必填）
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 服务角色名称，例如 COSNotifyRole（订阅时必填；服务端按当前租户拼接完整 ARN） 
     * @return RoleArn 服务角色名称，例如 COSNotifyRole（订阅时必填；服务端按当前租户拼接完整 ARN）
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set 服务角色名称，例如 COSNotifyRole（订阅时必填；服务端按当前租户拼接完整 ARN）
     * @param RoleArn 服务角色名称，例如 COSNotifyRole（订阅时必填；服务端按当前租户拼接完整 ARN）
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get COS 存储桶所在地域，例如 ap-guangzhou（订阅时必填；过渡方案，后续可能改为服务端自动解析并移除） 
     * @return Region COS 存储桶所在地域，例如 ap-guangzhou（订阅时必填；过渡方案，后续可能改为服务端自动解析并移除）
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set COS 存储桶所在地域，例如 ap-guangzhou（订阅时必填；过渡方案，后续可能改为服务端自动解析并移除）
     * @param Region COS 存储桶所在地域，例如 ap-guangzhou（订阅时必填；过渡方案，后续可能改为服务端自动解析并移除）
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public CosEventSubscription() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosEventSubscription(CosEventSubscription source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.RoleArn != null) {
            this.RoleArn = new String(source.RoleArn);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

