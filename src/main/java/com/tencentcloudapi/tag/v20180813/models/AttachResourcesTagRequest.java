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

public class AttachResourcesTagRequest extends AbstractModel {

    /**
    * 业务类型，示例 cvm 。资源所属业务名称（资源六段式中的第三段）
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 资源ID数组，资源个数最多为50
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * 需要绑定的标签键，取值规范参考：https://cloud.tencent.com/document/product/651/13354
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * 需要绑定的标签值，取值规范参考：https://cloud.tencent.com/document/product/651/13354
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * 资源所在地域，不区分地域的资源则不必填。区分地域的资源则必填，且必填时必须是参数ResourceIds.N资源所对应的地域，且如果ResourceIds.N为批量时，这些资源也必须是同一个地域的。例如示例值：ap-beijing，则参数ResourceIds.N中都应该填写该地域的资源。
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 资源前缀（资源六段式中最后一段"/"前面的部分，例如“qcs::ckafka:ap-shanghai:uin/123456789:ckafkaId/ckafka-o85jq584” 中资源前缀为ckafkaId），cos存储桶不需要传入该字段，其他云资源必填
    */
    @SerializedName("ResourcePrefix")
    @Expose
    private String ResourcePrefix;

    /**
     * Get 业务类型，示例 cvm 。资源所属业务名称（资源六段式中的第三段） 
     * @return ServiceType 业务类型，示例 cvm 。资源所属业务名称（资源六段式中的第三段）
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 业务类型，示例 cvm 。资源所属业务名称（资源六段式中的第三段）
     * @param ServiceType 业务类型，示例 cvm 。资源所属业务名称（资源六段式中的第三段）
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 资源ID数组，资源个数最多为50 
     * @return ResourceIds 资源ID数组，资源个数最多为50
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 资源ID数组，资源个数最多为50
     * @param ResourceIds 资源ID数组，资源个数最多为50
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 需要绑定的标签键，取值规范参考：https://cloud.tencent.com/document/product/651/13354 
     * @return TagKey 需要绑定的标签键，取值规范参考：https://cloud.tencent.com/document/product/651/13354
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set 需要绑定的标签键，取值规范参考：https://cloud.tencent.com/document/product/651/13354
     * @param TagKey 需要绑定的标签键，取值规范参考：https://cloud.tencent.com/document/product/651/13354
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get 需要绑定的标签值，取值规范参考：https://cloud.tencent.com/document/product/651/13354 
     * @return TagValue 需要绑定的标签值，取值规范参考：https://cloud.tencent.com/document/product/651/13354
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set 需要绑定的标签值，取值规范参考：https://cloud.tencent.com/document/product/651/13354
     * @param TagValue 需要绑定的标签值，取值规范参考：https://cloud.tencent.com/document/product/651/13354
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get 资源所在地域，不区分地域的资源则不必填。区分地域的资源则必填，且必填时必须是参数ResourceIds.N资源所对应的地域，且如果ResourceIds.N为批量时，这些资源也必须是同一个地域的。例如示例值：ap-beijing，则参数ResourceIds.N中都应该填写该地域的资源。 
     * @return ResourceRegion 资源所在地域，不区分地域的资源则不必填。区分地域的资源则必填，且必填时必须是参数ResourceIds.N资源所对应的地域，且如果ResourceIds.N为批量时，这些资源也必须是同一个地域的。例如示例值：ap-beijing，则参数ResourceIds.N中都应该填写该地域的资源。
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源所在地域，不区分地域的资源则不必填。区分地域的资源则必填，且必填时必须是参数ResourceIds.N资源所对应的地域，且如果ResourceIds.N为批量时，这些资源也必须是同一个地域的。例如示例值：ap-beijing，则参数ResourceIds.N中都应该填写该地域的资源。
     * @param ResourceRegion 资源所在地域，不区分地域的资源则不必填。区分地域的资源则必填，且必填时必须是参数ResourceIds.N资源所对应的地域，且如果ResourceIds.N为批量时，这些资源也必须是同一个地域的。例如示例值：ap-beijing，则参数ResourceIds.N中都应该填写该地域的资源。
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 资源前缀（资源六段式中最后一段"/"前面的部分，例如“qcs::ckafka:ap-shanghai:uin/123456789:ckafkaId/ckafka-o85jq584” 中资源前缀为ckafkaId），cos存储桶不需要传入该字段，其他云资源必填 
     * @return ResourcePrefix 资源前缀（资源六段式中最后一段"/"前面的部分，例如“qcs::ckafka:ap-shanghai:uin/123456789:ckafkaId/ckafka-o85jq584” 中资源前缀为ckafkaId），cos存储桶不需要传入该字段，其他云资源必填
     */
    public String getResourcePrefix() {
        return this.ResourcePrefix;
    }

    /**
     * Set 资源前缀（资源六段式中最后一段"/"前面的部分，例如“qcs::ckafka:ap-shanghai:uin/123456789:ckafkaId/ckafka-o85jq584” 中资源前缀为ckafkaId），cos存储桶不需要传入该字段，其他云资源必填
     * @param ResourcePrefix 资源前缀（资源六段式中最后一段"/"前面的部分，例如“qcs::ckafka:ap-shanghai:uin/123456789:ckafkaId/ckafka-o85jq584” 中资源前缀为ckafkaId），cos存储桶不需要传入该字段，其他云资源必填
     */
    public void setResourcePrefix(String ResourcePrefix) {
        this.ResourcePrefix = ResourcePrefix;
    }

    public AttachResourcesTagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachResourcesTagRequest(AttachResourcesTagRequest source) {
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.ResourcePrefix != null) {
            this.ResourcePrefix = new String(source.ResourcePrefix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "ResourcePrefix", this.ResourcePrefix);

    }
}

