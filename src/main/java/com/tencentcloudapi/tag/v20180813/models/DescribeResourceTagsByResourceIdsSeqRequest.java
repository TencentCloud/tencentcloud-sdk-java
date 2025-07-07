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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceTagsByResourceIdsSeqRequest extends AbstractModel {

    /**
    * 业务类型，示例 cvm 。指资源所属业务类型，也是资源六段式中的第三段，例如qcs::ckafka:ap-shanghai:uin/123456789:ckafkaId/ckafka-o85jq584中业务类型为ckafka
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 该业务类型对应的资源前缀，示例 cvm对应instance、image、volume等。也是资源六段式中的第六段，例如qcs::ckafka:ap-shanghai:uin/123456789:ckafkaId/ckafka-o85jq584中资源前缀为ckafkaId。cos存储桶为非必填，其他云资源为必填
    */
    @SerializedName("ResourcePrefix")
    @Expose
    private String ResourcePrefix;

    /**
    * 资源唯一标记
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * 资源所在地域，示例：ap-guangzhou, 不区分地域的资源该字段传空字符串，区分地域的资源必填
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 数据偏移量，默认为 0, 必须为Limit参数的整数倍
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页大小，默认为 15
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 业务类型，示例 cvm 。指资源所属业务类型，也是资源六段式中的第三段，例如qcs::ckafka:ap-shanghai:uin/123456789:ckafkaId/ckafka-o85jq584中业务类型为ckafka 
     * @return ServiceType 业务类型，示例 cvm 。指资源所属业务类型，也是资源六段式中的第三段，例如qcs::ckafka:ap-shanghai:uin/123456789:ckafkaId/ckafka-o85jq584中业务类型为ckafka
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 业务类型，示例 cvm 。指资源所属业务类型，也是资源六段式中的第三段，例如qcs::ckafka:ap-shanghai:uin/123456789:ckafkaId/ckafka-o85jq584中业务类型为ckafka
     * @param ServiceType 业务类型，示例 cvm 。指资源所属业务类型，也是资源六段式中的第三段，例如qcs::ckafka:ap-shanghai:uin/123456789:ckafkaId/ckafka-o85jq584中业务类型为ckafka
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 该业务类型对应的资源前缀，示例 cvm对应instance、image、volume等。也是资源六段式中的第六段，例如qcs::ckafka:ap-shanghai:uin/123456789:ckafkaId/ckafka-o85jq584中资源前缀为ckafkaId。cos存储桶为非必填，其他云资源为必填 
     * @return ResourcePrefix 该业务类型对应的资源前缀，示例 cvm对应instance、image、volume等。也是资源六段式中的第六段，例如qcs::ckafka:ap-shanghai:uin/123456789:ckafkaId/ckafka-o85jq584中资源前缀为ckafkaId。cos存储桶为非必填，其他云资源为必填
     */
    public String getResourcePrefix() {
        return this.ResourcePrefix;
    }

    /**
     * Set 该业务类型对应的资源前缀，示例 cvm对应instance、image、volume等。也是资源六段式中的第六段，例如qcs::ckafka:ap-shanghai:uin/123456789:ckafkaId/ckafka-o85jq584中资源前缀为ckafkaId。cos存储桶为非必填，其他云资源为必填
     * @param ResourcePrefix 该业务类型对应的资源前缀，示例 cvm对应instance、image、volume等。也是资源六段式中的第六段，例如qcs::ckafka:ap-shanghai:uin/123456789:ckafkaId/ckafka-o85jq584中资源前缀为ckafkaId。cos存储桶为非必填，其他云资源为必填
     */
    public void setResourcePrefix(String ResourcePrefix) {
        this.ResourcePrefix = ResourcePrefix;
    }

    /**
     * Get 资源唯一标记 
     * @return ResourceIds 资源唯一标记
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 资源唯一标记
     * @param ResourceIds 资源唯一标记
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 资源所在地域，示例：ap-guangzhou, 不区分地域的资源该字段传空字符串，区分地域的资源必填 
     * @return ResourceRegion 资源所在地域，示例：ap-guangzhou, 不区分地域的资源该字段传空字符串，区分地域的资源必填
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源所在地域，示例：ap-guangzhou, 不区分地域的资源该字段传空字符串，区分地域的资源必填
     * @param ResourceRegion 资源所在地域，示例：ap-guangzhou, 不区分地域的资源该字段传空字符串，区分地域的资源必填
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 数据偏移量，默认为 0, 必须为Limit参数的整数倍 
     * @return Offset 数据偏移量，默认为 0, 必须为Limit参数的整数倍
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 数据偏移量，默认为 0, 必须为Limit参数的整数倍
     * @param Offset 数据偏移量，默认为 0, 必须为Limit参数的整数倍
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页大小，默认为 15 
     * @return Limit 每页大小，默认为 15
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页大小，默认为 15
     * @param Limit 每页大小，默认为 15
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeResourceTagsByResourceIdsSeqRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceTagsByResourceIdsSeqRequest(DescribeResourceTagsByResourceIdsSeqRequest source) {
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ResourcePrefix != null) {
            this.ResourcePrefix = new String(source.ResourcePrefix);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
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
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ResourcePrefix", this.ResourcePrefix);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

