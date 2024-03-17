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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGovernanceAliasesRequest extends AbstractModel {

    /**
    * tse实例id。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 服务别名所指向的服务名。
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * 服务别名所指向的命名空间名。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 服务别名。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 服务别名命名空间。
    */
    @SerializedName("AliasNamespace")
    @Expose
    private String AliasNamespace;

    /**
    * 服务别名描述。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get tse实例id。 
     * @return InstanceId tse实例id。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set tse实例id。
     * @param InstanceId tse实例id。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 服务别名所指向的服务名。 
     * @return Service 服务别名所指向的服务名。
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 服务别名所指向的服务名。
     * @param Service 服务别名所指向的服务名。
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get 服务别名所指向的命名空间名。 
     * @return Namespace 服务别名所指向的命名空间名。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 服务别名所指向的命名空间名。
     * @param Namespace 服务别名所指向的命名空间名。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 服务别名。 
     * @return Alias 服务别名。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 服务别名。
     * @param Alias 服务别名。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 服务别名命名空间。 
     * @return AliasNamespace 服务别名命名空间。
     */
    public String getAliasNamespace() {
        return this.AliasNamespace;
    }

    /**
     * Set 服务别名命名空间。
     * @param AliasNamespace 服务别名命名空间。
     */
    public void setAliasNamespace(String AliasNamespace) {
        this.AliasNamespace = AliasNamespace;
    }

    /**
     * Get 服务别名描述。 
     * @return Comment 服务别名描述。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 服务别名描述。
     * @param Comment 服务别名描述。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeGovernanceAliasesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGovernanceAliasesRequest(DescribeGovernanceAliasesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.AliasNamespace != null) {
            this.AliasNamespace = new String(source.AliasNamespace);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "AliasNamespace", this.AliasNamespace);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

