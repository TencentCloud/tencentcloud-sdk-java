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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Evaluation extends AbstractModel {

    /**
    * 已评估资源ID。长度为0~256个字符
    */
    @SerializedName("ComplianceResourceId")
    @Expose
    private String ComplianceResourceId;

    /**
    * 已评估资源类型。
支持:
QCS::CVM::Instance、 QCS::CBS::Disk、QCS::VPC::Vpc、QCS::VPC::Subnet、QCS::VPC::SecurityGroup、 QCS::CAM::User、QCS::CAM::Group、QCS::CAM::Policy、QCS::CAM::Role、QCS::COS::Bucket
    */
    @SerializedName("ComplianceResourceType")
    @Expose
    private String ComplianceResourceType;

    /**
    * 已评估资源地域。
长度为0~32个字符
    */
    @SerializedName("ComplianceRegion")
    @Expose
    private String ComplianceRegion;

    /**
    * 合规类型。取值：
COMPLIANT：合规、
NON_COMPLIANT：不合规
    */
    @SerializedName("ComplianceType")
    @Expose
    private String ComplianceType;

    /**
    * 不合规资源的补充信息。
    */
    @SerializedName("Annotation")
    @Expose
    private Annotation Annotation;

    /**
     * Get 已评估资源ID。长度为0~256个字符 
     * @return ComplianceResourceId 已评估资源ID。长度为0~256个字符
     */
    public String getComplianceResourceId() {
        return this.ComplianceResourceId;
    }

    /**
     * Set 已评估资源ID。长度为0~256个字符
     * @param ComplianceResourceId 已评估资源ID。长度为0~256个字符
     */
    public void setComplianceResourceId(String ComplianceResourceId) {
        this.ComplianceResourceId = ComplianceResourceId;
    }

    /**
     * Get 已评估资源类型。
支持:
QCS::CVM::Instance、 QCS::CBS::Disk、QCS::VPC::Vpc、QCS::VPC::Subnet、QCS::VPC::SecurityGroup、 QCS::CAM::User、QCS::CAM::Group、QCS::CAM::Policy、QCS::CAM::Role、QCS::COS::Bucket 
     * @return ComplianceResourceType 已评估资源类型。
支持:
QCS::CVM::Instance、 QCS::CBS::Disk、QCS::VPC::Vpc、QCS::VPC::Subnet、QCS::VPC::SecurityGroup、 QCS::CAM::User、QCS::CAM::Group、QCS::CAM::Policy、QCS::CAM::Role、QCS::COS::Bucket
     */
    public String getComplianceResourceType() {
        return this.ComplianceResourceType;
    }

    /**
     * Set 已评估资源类型。
支持:
QCS::CVM::Instance、 QCS::CBS::Disk、QCS::VPC::Vpc、QCS::VPC::Subnet、QCS::VPC::SecurityGroup、 QCS::CAM::User、QCS::CAM::Group、QCS::CAM::Policy、QCS::CAM::Role、QCS::COS::Bucket
     * @param ComplianceResourceType 已评估资源类型。
支持:
QCS::CVM::Instance、 QCS::CBS::Disk、QCS::VPC::Vpc、QCS::VPC::Subnet、QCS::VPC::SecurityGroup、 QCS::CAM::User、QCS::CAM::Group、QCS::CAM::Policy、QCS::CAM::Role、QCS::COS::Bucket
     */
    public void setComplianceResourceType(String ComplianceResourceType) {
        this.ComplianceResourceType = ComplianceResourceType;
    }

    /**
     * Get 已评估资源地域。
长度为0~32个字符 
     * @return ComplianceRegion 已评估资源地域。
长度为0~32个字符
     */
    public String getComplianceRegion() {
        return this.ComplianceRegion;
    }

    /**
     * Set 已评估资源地域。
长度为0~32个字符
     * @param ComplianceRegion 已评估资源地域。
长度为0~32个字符
     */
    public void setComplianceRegion(String ComplianceRegion) {
        this.ComplianceRegion = ComplianceRegion;
    }

    /**
     * Get 合规类型。取值：
COMPLIANT：合规、
NON_COMPLIANT：不合规 
     * @return ComplianceType 合规类型。取值：
COMPLIANT：合规、
NON_COMPLIANT：不合规
     */
    public String getComplianceType() {
        return this.ComplianceType;
    }

    /**
     * Set 合规类型。取值：
COMPLIANT：合规、
NON_COMPLIANT：不合规
     * @param ComplianceType 合规类型。取值：
COMPLIANT：合规、
NON_COMPLIANT：不合规
     */
    public void setComplianceType(String ComplianceType) {
        this.ComplianceType = ComplianceType;
    }

    /**
     * Get 不合规资源的补充信息。 
     * @return Annotation 不合规资源的补充信息。
     */
    public Annotation getAnnotation() {
        return this.Annotation;
    }

    /**
     * Set 不合规资源的补充信息。
     * @param Annotation 不合规资源的补充信息。
     */
    public void setAnnotation(Annotation Annotation) {
        this.Annotation = Annotation;
    }

    public Evaluation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Evaluation(Evaluation source) {
        if (source.ComplianceResourceId != null) {
            this.ComplianceResourceId = new String(source.ComplianceResourceId);
        }
        if (source.ComplianceResourceType != null) {
            this.ComplianceResourceType = new String(source.ComplianceResourceType);
        }
        if (source.ComplianceRegion != null) {
            this.ComplianceRegion = new String(source.ComplianceRegion);
        }
        if (source.ComplianceType != null) {
            this.ComplianceType = new String(source.ComplianceType);
        }
        if (source.Annotation != null) {
            this.Annotation = new Annotation(source.Annotation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComplianceResourceId", this.ComplianceResourceId);
        this.setParamSimple(map, prefix + "ComplianceResourceType", this.ComplianceResourceType);
        this.setParamSimple(map, prefix + "ComplianceRegion", this.ComplianceRegion);
        this.setParamSimple(map, prefix + "ComplianceType", this.ComplianceType);
        this.setParamObj(map, prefix + "Annotation.", this.Annotation);

    }
}

