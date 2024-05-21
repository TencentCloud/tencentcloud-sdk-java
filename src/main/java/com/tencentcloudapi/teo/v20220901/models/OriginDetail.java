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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginDetail extends AbstractModel {

    /**
    * 源站类型，取值有：
<li>IP_DOMAIN：IPV4、IPV6 或域名类型源站；</li>
<li>COS：腾讯云 COS 对象存储源站；</li>
<li>AWS_S3：AWS S3 对象存储源站；</li>
<li>ORIGIN_GROUP：源站组类型源站；</li>
<li>VODEO：云点播-混合云版；</li>
<li>SPACE：源站卸载，当前仅白名单开放；</li>
<li>LB：负载均衡，当前仅白名单开放。</li>
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * 源站地址，根据 OriginType 的取值分为以下情况：
<li>当 OriginType = IP_DOMAIN 时，该参数为 IPv4、IPv6 地址或域名；</li>
<li>当 OriginType = COS 时，该参数为 COS 桶的访问域名；</li>
<li>当 OriginType = AWS_S3，该参数为 S3 桶的访问域名；</li>
<li>当 OriginType = ORIGIN_GROUP 时，该参数为源站组 ID；</li>
<li>当 OriginType = VODEO 时，如果 VodeoDistributionRange = ALL，则该参数为 "all-buckets-in-vodeo-application"；如果 VodeoDistributionRange = Bucket，则该参数为对应存储桶域名。</li>
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * 备用源站组 ID，该参数仅在 OriginType = ORIGIN_GROUP 且配置了备源站组时会生效。
    */
    @SerializedName("BackupOrigin")
    @Expose
    private String BackupOrigin;

    /**
    * 主源源站组名称，当 OriginType = ORIGIN_GROUP 时该参数会返回值。
    */
    @SerializedName("OriginGroupName")
    @Expose
    private String OriginGroupName;

    /**
    * 备用源站组名称，该参数仅当 OriginType = ORIGIN_GROUP 且配置了备用源站组时会生效。
    */
    @SerializedName("BackOriginGroupName")
    @Expose
    private String BackOriginGroupName;

    /**
    * 指定是否允许访问私有对象存储源站，该参数仅当源站类型OriginType = COS 或 AWS_S3 时会生效，取值有：
<li>on：使用私有鉴权；</li>
<li>off：不使用私有鉴权。</li>
不填写，默认值为 off。
    */
    @SerializedName("PrivateAccess")
    @Expose
    private String PrivateAccess;

    /**
    * 私有鉴权使用参数，该参数仅当源站类型 PrivateAccess = on 时会生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateParameters")
    @Expose
    private PrivateParameter [] PrivateParameters;

    /**
    * MO 子应用 ID
    */
    @SerializedName("VodeoSubAppId")
    @Expose
    private Long VodeoSubAppId;

    /**
    * MO 分发范围，取值有： <li>All：全部</li> <li>Bucket：存储桶</li>
    */
    @SerializedName("VodeoDistributionRange")
    @Expose
    private String VodeoDistributionRange;

    /**
    * MO 存储桶 ID，分发范围(DistributionRange)为存储桶(Bucket)时必填
    */
    @SerializedName("VodeoBucketId")
    @Expose
    private String VodeoBucketId;

    /**
     * Get 源站类型，取值有：
<li>IP_DOMAIN：IPV4、IPV6 或域名类型源站；</li>
<li>COS：腾讯云 COS 对象存储源站；</li>
<li>AWS_S3：AWS S3 对象存储源站；</li>
<li>ORIGIN_GROUP：源站组类型源站；</li>
<li>VODEO：云点播-混合云版；</li>
<li>SPACE：源站卸载，当前仅白名单开放；</li>
<li>LB：负载均衡，当前仅白名单开放。</li> 
     * @return OriginType 源站类型，取值有：
<li>IP_DOMAIN：IPV4、IPV6 或域名类型源站；</li>
<li>COS：腾讯云 COS 对象存储源站；</li>
<li>AWS_S3：AWS S3 对象存储源站；</li>
<li>ORIGIN_GROUP：源站组类型源站；</li>
<li>VODEO：云点播-混合云版；</li>
<li>SPACE：源站卸载，当前仅白名单开放；</li>
<li>LB：负载均衡，当前仅白名单开放。</li>
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set 源站类型，取值有：
<li>IP_DOMAIN：IPV4、IPV6 或域名类型源站；</li>
<li>COS：腾讯云 COS 对象存储源站；</li>
<li>AWS_S3：AWS S3 对象存储源站；</li>
<li>ORIGIN_GROUP：源站组类型源站；</li>
<li>VODEO：云点播-混合云版；</li>
<li>SPACE：源站卸载，当前仅白名单开放；</li>
<li>LB：负载均衡，当前仅白名单开放。</li>
     * @param OriginType 源站类型，取值有：
<li>IP_DOMAIN：IPV4、IPV6 或域名类型源站；</li>
<li>COS：腾讯云 COS 对象存储源站；</li>
<li>AWS_S3：AWS S3 对象存储源站；</li>
<li>ORIGIN_GROUP：源站组类型源站；</li>
<li>VODEO：云点播-混合云版；</li>
<li>SPACE：源站卸载，当前仅白名单开放；</li>
<li>LB：负载均衡，当前仅白名单开放。</li>
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get 源站地址，根据 OriginType 的取值分为以下情况：
<li>当 OriginType = IP_DOMAIN 时，该参数为 IPv4、IPv6 地址或域名；</li>
<li>当 OriginType = COS 时，该参数为 COS 桶的访问域名；</li>
<li>当 OriginType = AWS_S3，该参数为 S3 桶的访问域名；</li>
<li>当 OriginType = ORIGIN_GROUP 时，该参数为源站组 ID；</li>
<li>当 OriginType = VODEO 时，如果 VodeoDistributionRange = ALL，则该参数为 "all-buckets-in-vodeo-application"；如果 VodeoDistributionRange = Bucket，则该参数为对应存储桶域名。</li> 
     * @return Origin 源站地址，根据 OriginType 的取值分为以下情况：
<li>当 OriginType = IP_DOMAIN 时，该参数为 IPv4、IPv6 地址或域名；</li>
<li>当 OriginType = COS 时，该参数为 COS 桶的访问域名；</li>
<li>当 OriginType = AWS_S3，该参数为 S3 桶的访问域名；</li>
<li>当 OriginType = ORIGIN_GROUP 时，该参数为源站组 ID；</li>
<li>当 OriginType = VODEO 时，如果 VodeoDistributionRange = ALL，则该参数为 "all-buckets-in-vodeo-application"；如果 VodeoDistributionRange = Bucket，则该参数为对应存储桶域名。</li>
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set 源站地址，根据 OriginType 的取值分为以下情况：
<li>当 OriginType = IP_DOMAIN 时，该参数为 IPv4、IPv6 地址或域名；</li>
<li>当 OriginType = COS 时，该参数为 COS 桶的访问域名；</li>
<li>当 OriginType = AWS_S3，该参数为 S3 桶的访问域名；</li>
<li>当 OriginType = ORIGIN_GROUP 时，该参数为源站组 ID；</li>
<li>当 OriginType = VODEO 时，如果 VodeoDistributionRange = ALL，则该参数为 "all-buckets-in-vodeo-application"；如果 VodeoDistributionRange = Bucket，则该参数为对应存储桶域名。</li>
     * @param Origin 源站地址，根据 OriginType 的取值分为以下情况：
<li>当 OriginType = IP_DOMAIN 时，该参数为 IPv4、IPv6 地址或域名；</li>
<li>当 OriginType = COS 时，该参数为 COS 桶的访问域名；</li>
<li>当 OriginType = AWS_S3，该参数为 S3 桶的访问域名；</li>
<li>当 OriginType = ORIGIN_GROUP 时，该参数为源站组 ID；</li>
<li>当 OriginType = VODEO 时，如果 VodeoDistributionRange = ALL，则该参数为 "all-buckets-in-vodeo-application"；如果 VodeoDistributionRange = Bucket，则该参数为对应存储桶域名。</li>
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get 备用源站组 ID，该参数仅在 OriginType = ORIGIN_GROUP 且配置了备源站组时会生效。 
     * @return BackupOrigin 备用源站组 ID，该参数仅在 OriginType = ORIGIN_GROUP 且配置了备源站组时会生效。
     */
    public String getBackupOrigin() {
        return this.BackupOrigin;
    }

    /**
     * Set 备用源站组 ID，该参数仅在 OriginType = ORIGIN_GROUP 且配置了备源站组时会生效。
     * @param BackupOrigin 备用源站组 ID，该参数仅在 OriginType = ORIGIN_GROUP 且配置了备源站组时会生效。
     */
    public void setBackupOrigin(String BackupOrigin) {
        this.BackupOrigin = BackupOrigin;
    }

    /**
     * Get 主源源站组名称，当 OriginType = ORIGIN_GROUP 时该参数会返回值。 
     * @return OriginGroupName 主源源站组名称，当 OriginType = ORIGIN_GROUP 时该参数会返回值。
     */
    public String getOriginGroupName() {
        return this.OriginGroupName;
    }

    /**
     * Set 主源源站组名称，当 OriginType = ORIGIN_GROUP 时该参数会返回值。
     * @param OriginGroupName 主源源站组名称，当 OriginType = ORIGIN_GROUP 时该参数会返回值。
     */
    public void setOriginGroupName(String OriginGroupName) {
        this.OriginGroupName = OriginGroupName;
    }

    /**
     * Get 备用源站组名称，该参数仅当 OriginType = ORIGIN_GROUP 且配置了备用源站组时会生效。 
     * @return BackOriginGroupName 备用源站组名称，该参数仅当 OriginType = ORIGIN_GROUP 且配置了备用源站组时会生效。
     */
    public String getBackOriginGroupName() {
        return this.BackOriginGroupName;
    }

    /**
     * Set 备用源站组名称，该参数仅当 OriginType = ORIGIN_GROUP 且配置了备用源站组时会生效。
     * @param BackOriginGroupName 备用源站组名称，该参数仅当 OriginType = ORIGIN_GROUP 且配置了备用源站组时会生效。
     */
    public void setBackOriginGroupName(String BackOriginGroupName) {
        this.BackOriginGroupName = BackOriginGroupName;
    }

    /**
     * Get 指定是否允许访问私有对象存储源站，该参数仅当源站类型OriginType = COS 或 AWS_S3 时会生效，取值有：
<li>on：使用私有鉴权；</li>
<li>off：不使用私有鉴权。</li>
不填写，默认值为 off。 
     * @return PrivateAccess 指定是否允许访问私有对象存储源站，该参数仅当源站类型OriginType = COS 或 AWS_S3 时会生效，取值有：
<li>on：使用私有鉴权；</li>
<li>off：不使用私有鉴权。</li>
不填写，默认值为 off。
     */
    public String getPrivateAccess() {
        return this.PrivateAccess;
    }

    /**
     * Set 指定是否允许访问私有对象存储源站，该参数仅当源站类型OriginType = COS 或 AWS_S3 时会生效，取值有：
<li>on：使用私有鉴权；</li>
<li>off：不使用私有鉴权。</li>
不填写，默认值为 off。
     * @param PrivateAccess 指定是否允许访问私有对象存储源站，该参数仅当源站类型OriginType = COS 或 AWS_S3 时会生效，取值有：
<li>on：使用私有鉴权；</li>
<li>off：不使用私有鉴权。</li>
不填写，默认值为 off。
     */
    public void setPrivateAccess(String PrivateAccess) {
        this.PrivateAccess = PrivateAccess;
    }

    /**
     * Get 私有鉴权使用参数，该参数仅当源站类型 PrivateAccess = on 时会生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateParameters 私有鉴权使用参数，该参数仅当源站类型 PrivateAccess = on 时会生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrivateParameter [] getPrivateParameters() {
        return this.PrivateParameters;
    }

    /**
     * Set 私有鉴权使用参数，该参数仅当源站类型 PrivateAccess = on 时会生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateParameters 私有鉴权使用参数，该参数仅当源站类型 PrivateAccess = on 时会生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateParameters(PrivateParameter [] PrivateParameters) {
        this.PrivateParameters = PrivateParameters;
    }

    /**
     * Get MO 子应用 ID 
     * @return VodeoSubAppId MO 子应用 ID
     */
    public Long getVodeoSubAppId() {
        return this.VodeoSubAppId;
    }

    /**
     * Set MO 子应用 ID
     * @param VodeoSubAppId MO 子应用 ID
     */
    public void setVodeoSubAppId(Long VodeoSubAppId) {
        this.VodeoSubAppId = VodeoSubAppId;
    }

    /**
     * Get MO 分发范围，取值有： <li>All：全部</li> <li>Bucket：存储桶</li> 
     * @return VodeoDistributionRange MO 分发范围，取值有： <li>All：全部</li> <li>Bucket：存储桶</li>
     */
    public String getVodeoDistributionRange() {
        return this.VodeoDistributionRange;
    }

    /**
     * Set MO 分发范围，取值有： <li>All：全部</li> <li>Bucket：存储桶</li>
     * @param VodeoDistributionRange MO 分发范围，取值有： <li>All：全部</li> <li>Bucket：存储桶</li>
     */
    public void setVodeoDistributionRange(String VodeoDistributionRange) {
        this.VodeoDistributionRange = VodeoDistributionRange;
    }

    /**
     * Get MO 存储桶 ID，分发范围(DistributionRange)为存储桶(Bucket)时必填 
     * @return VodeoBucketId MO 存储桶 ID，分发范围(DistributionRange)为存储桶(Bucket)时必填
     */
    public String getVodeoBucketId() {
        return this.VodeoBucketId;
    }

    /**
     * Set MO 存储桶 ID，分发范围(DistributionRange)为存储桶(Bucket)时必填
     * @param VodeoBucketId MO 存储桶 ID，分发范围(DistributionRange)为存储桶(Bucket)时必填
     */
    public void setVodeoBucketId(String VodeoBucketId) {
        this.VodeoBucketId = VodeoBucketId;
    }

    public OriginDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginDetail(OriginDetail source) {
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.BackupOrigin != null) {
            this.BackupOrigin = new String(source.BackupOrigin);
        }
        if (source.OriginGroupName != null) {
            this.OriginGroupName = new String(source.OriginGroupName);
        }
        if (source.BackOriginGroupName != null) {
            this.BackOriginGroupName = new String(source.BackOriginGroupName);
        }
        if (source.PrivateAccess != null) {
            this.PrivateAccess = new String(source.PrivateAccess);
        }
        if (source.PrivateParameters != null) {
            this.PrivateParameters = new PrivateParameter[source.PrivateParameters.length];
            for (int i = 0; i < source.PrivateParameters.length; i++) {
                this.PrivateParameters[i] = new PrivateParameter(source.PrivateParameters[i]);
            }
        }
        if (source.VodeoSubAppId != null) {
            this.VodeoSubAppId = new Long(source.VodeoSubAppId);
        }
        if (source.VodeoDistributionRange != null) {
            this.VodeoDistributionRange = new String(source.VodeoDistributionRange);
        }
        if (source.VodeoBucketId != null) {
            this.VodeoBucketId = new String(source.VodeoBucketId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "BackupOrigin", this.BackupOrigin);
        this.setParamSimple(map, prefix + "OriginGroupName", this.OriginGroupName);
        this.setParamSimple(map, prefix + "BackOriginGroupName", this.BackOriginGroupName);
        this.setParamSimple(map, prefix + "PrivateAccess", this.PrivateAccess);
        this.setParamArrayObj(map, prefix + "PrivateParameters.", this.PrivateParameters);
        this.setParamSimple(map, prefix + "VodeoSubAppId", this.VodeoSubAppId);
        this.setParamSimple(map, prefix + "VodeoDistributionRange", this.VodeoDistributionRange);
        this.setParamSimple(map, prefix + "VodeoBucketId", this.VodeoBucketId);

    }
}

