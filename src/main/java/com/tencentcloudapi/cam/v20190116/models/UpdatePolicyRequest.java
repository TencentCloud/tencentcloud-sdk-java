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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdatePolicyRequest extends AbstractModel{

    /**
    * 策略ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 策略名
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 策略描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 策略文档，示例：{"version":"2.0","statement":[{"action":"name/sts:AssumeRole","effect":"allow","principal":{"service":["cloudaudit.cloud.tencent.com","cls.cloud.tencent.com"]}}]}，principal用于指定角色的授权对象。获取该参数可参阅 获取角色详情（https://cloud.tencent.com/document/product/598/36221） 输出参数RoleInfo
    */
    @SerializedName("PolicyDocument")
    @Expose
    private String PolicyDocument;

    /**
    * 预设策略备注
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
     * Get 策略ID 
     * @return PolicyId 策略ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略ID
     * @param PolicyId 策略ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 策略名 
     * @return PolicyName 策略名
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名
     * @param PolicyName 策略名
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 策略描述 
     * @return Description 策略描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 策略描述
     * @param Description 策略描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 策略文档，示例：{"version":"2.0","statement":[{"action":"name/sts:AssumeRole","effect":"allow","principal":{"service":["cloudaudit.cloud.tencent.com","cls.cloud.tencent.com"]}}]}，principal用于指定角色的授权对象。获取该参数可参阅 获取角色详情（https://cloud.tencent.com/document/product/598/36221） 输出参数RoleInfo 
     * @return PolicyDocument 策略文档，示例：{"version":"2.0","statement":[{"action":"name/sts:AssumeRole","effect":"allow","principal":{"service":["cloudaudit.cloud.tencent.com","cls.cloud.tencent.com"]}}]}，principal用于指定角色的授权对象。获取该参数可参阅 获取角色详情（https://cloud.tencent.com/document/product/598/36221） 输出参数RoleInfo
     */
    public String getPolicyDocument() {
        return this.PolicyDocument;
    }

    /**
     * Set 策略文档，示例：{"version":"2.0","statement":[{"action":"name/sts:AssumeRole","effect":"allow","principal":{"service":["cloudaudit.cloud.tencent.com","cls.cloud.tencent.com"]}}]}，principal用于指定角色的授权对象。获取该参数可参阅 获取角色详情（https://cloud.tencent.com/document/product/598/36221） 输出参数RoleInfo
     * @param PolicyDocument 策略文档，示例：{"version":"2.0","statement":[{"action":"name/sts:AssumeRole","effect":"allow","principal":{"service":["cloudaudit.cloud.tencent.com","cls.cloud.tencent.com"]}}]}，principal用于指定角色的授权对象。获取该参数可参阅 获取角色详情（https://cloud.tencent.com/document/product/598/36221） 输出参数RoleInfo
     */
    public void setPolicyDocument(String PolicyDocument) {
        this.PolicyDocument = PolicyDocument;
    }

    /**
     * Get 预设策略备注 
     * @return Alias 预设策略备注
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 预设策略备注
     * @param Alias 预设策略备注
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PolicyDocument", this.PolicyDocument);
        this.setParamSimple(map, prefix + "Alias", this.Alias);

    }
}

