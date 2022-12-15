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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeParameterTemplateAttributesResponse extends AbstractModel{

    /**
    * 参数模板ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 参数模板包含的参数个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 参数模板包含的参数信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamInfoSet")
    @Expose
    private ParamInfo [] ParamInfoSet;

    /**
    * 参数模板名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 参数模板适用的数据库版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBMajorVersion")
    @Expose
    private String DBMajorVersion;

    /**
    * 参数模板适用的数据库引擎
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBEngine")
    @Expose
    private String DBEngine;

    /**
    * 参数模板描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateDescription")
    @Expose
    private String TemplateDescription;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 参数模板ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateId 参数模板ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 参数模板ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateId 参数模板ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 参数模板包含的参数个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 参数模板包含的参数个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 参数模板包含的参数个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 参数模板包含的参数个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 参数模板包含的参数信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamInfoSet 参数模板包含的参数信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParamInfo [] getParamInfoSet() {
        return this.ParamInfoSet;
    }

    /**
     * Set 参数模板包含的参数信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamInfoSet 参数模板包含的参数信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamInfoSet(ParamInfo [] ParamInfoSet) {
        this.ParamInfoSet = ParamInfoSet;
    }

    /**
     * Get 参数模板名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateName 参数模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 参数模板名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateName 参数模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 参数模板适用的数据库版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBMajorVersion 参数模板适用的数据库版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDBMajorVersion() {
        return this.DBMajorVersion;
    }

    /**
     * Set 参数模板适用的数据库版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBMajorVersion 参数模板适用的数据库版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBMajorVersion(String DBMajorVersion) {
        this.DBMajorVersion = DBMajorVersion;
    }

    /**
     * Get 参数模板适用的数据库引擎
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBEngine 参数模板适用的数据库引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDBEngine() {
        return this.DBEngine;
    }

    /**
     * Set 参数模板适用的数据库引擎
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBEngine 参数模板适用的数据库引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBEngine(String DBEngine) {
        this.DBEngine = DBEngine;
    }

    /**
     * Get 参数模板描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateDescription 参数模板描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateDescription() {
        return this.TemplateDescription;
    }

    /**
     * Set 参数模板描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateDescription 参数模板描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateDescription(String TemplateDescription) {
        this.TemplateDescription = TemplateDescription;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeParameterTemplateAttributesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeParameterTemplateAttributesResponse(DescribeParameterTemplateAttributesResponse source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ParamInfoSet != null) {
            this.ParamInfoSet = new ParamInfo[source.ParamInfoSet.length];
            for (int i = 0; i < source.ParamInfoSet.length; i++) {
                this.ParamInfoSet[i] = new ParamInfo(source.ParamInfoSet[i]);
            }
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.DBMajorVersion != null) {
            this.DBMajorVersion = new String(source.DBMajorVersion);
        }
        if (source.DBEngine != null) {
            this.DBEngine = new String(source.DBEngine);
        }
        if (source.TemplateDescription != null) {
            this.TemplateDescription = new String(source.TemplateDescription);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ParamInfoSet.", this.ParamInfoSet);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "DBMajorVersion", this.DBMajorVersion);
        this.setParamSimple(map, prefix + "DBEngine", this.DBEngine);
        this.setParamSimple(map, prefix + "TemplateDescription", this.TemplateDescription);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

