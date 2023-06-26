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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSupportProxyVersionResponse extends AbstractModel{

    /**
    * 支持的数据库代理版本集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportProxyVersions")
    @Expose
    private String [] SupportProxyVersions;

    /**
    * 当前proxy版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentProxyVersion")
    @Expose
    private String CurrentProxyVersion;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 支持的数据库代理版本集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportProxyVersions 支持的数据库代理版本集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSupportProxyVersions() {
        return this.SupportProxyVersions;
    }

    /**
     * Set 支持的数据库代理版本集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportProxyVersions 支持的数据库代理版本集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportProxyVersions(String [] SupportProxyVersions) {
        this.SupportProxyVersions = SupportProxyVersions;
    }

    /**
     * Get 当前proxy版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentProxyVersion 当前proxy版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurrentProxyVersion() {
        return this.CurrentProxyVersion;
    }

    /**
     * Set 当前proxy版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentProxyVersion 当前proxy版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentProxyVersion(String CurrentProxyVersion) {
        this.CurrentProxyVersion = CurrentProxyVersion;
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

    public DescribeSupportProxyVersionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSupportProxyVersionResponse(DescribeSupportProxyVersionResponse source) {
        if (source.SupportProxyVersions != null) {
            this.SupportProxyVersions = new String[source.SupportProxyVersions.length];
            for (int i = 0; i < source.SupportProxyVersions.length; i++) {
                this.SupportProxyVersions[i] = new String(source.SupportProxyVersions[i]);
            }
        }
        if (source.CurrentProxyVersion != null) {
            this.CurrentProxyVersion = new String(source.CurrentProxyVersion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SupportProxyVersions.", this.SupportProxyVersions);
        this.setParamSimple(map, prefix + "CurrentProxyVersion", this.CurrentProxyVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

