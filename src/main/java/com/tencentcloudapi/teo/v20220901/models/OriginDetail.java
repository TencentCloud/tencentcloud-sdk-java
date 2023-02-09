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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginDetail extends AbstractModel{

    /**
    * 源站类型，取值有：
<li>IP_DOMAIN：IPV4、IPV6或域名类型源站；</li>
<li>COS：COS源。</li>
<li>ORIGIN_GROUP：源站组类型源站。</li>
<li>AWS_S3：AWS S3对象存储源站。</li>
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * 源站地址，当OriginType参数指定为ORIGIN_GROUP时，该参数填写源站组ID，其他情况下填写源站地址。
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * 备用源站组ID，该参数在OriginType参数指定为ORIGIN_GROUP时生效，为空表示不使用备用源站。
    */
    @SerializedName("BackupOrigin")
    @Expose
    private String BackupOrigin;

    /**
    * 主源源站组名称，当OriginType参数指定为ORIGIN_GROUP时该参数生效。
    */
    @SerializedName("OriginGroupName")
    @Expose
    private String OriginGroupName;

    /**
    * 备用源站源站组名称，当OriginType参数指定为ORIGIN_GROUP，且用户指定了被用源站时该参数生效。
    */
    @SerializedName("BackOriginGroupName")
    @Expose
    private String BackOriginGroupName;

    /**
    * 指定是否允许访问私有对象存储源站。当源站类型OriginType=COS或AWS_S3时有效 取值有：
<li>on：使用私有鉴权；</li>
<li>off：不使用私有鉴权。</li>
不填写，默认值为off。
    */
    @SerializedName("PrivateAccess")
    @Expose
    private String PrivateAccess;

    /**
    * 私有鉴权使用参数，当源站类型PrivateAccess=on时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateParameters")
    @Expose
    private PrivateParameter [] PrivateParameters;

    /**
     * Get 源站类型，取值有：
<li>IP_DOMAIN：IPV4、IPV6或域名类型源站；</li>
<li>COS：COS源。</li>
<li>ORIGIN_GROUP：源站组类型源站。</li>
<li>AWS_S3：AWS S3对象存储源站。</li> 
     * @return OriginType 源站类型，取值有：
<li>IP_DOMAIN：IPV4、IPV6或域名类型源站；</li>
<li>COS：COS源。</li>
<li>ORIGIN_GROUP：源站组类型源站。</li>
<li>AWS_S3：AWS S3对象存储源站。</li>
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set 源站类型，取值有：
<li>IP_DOMAIN：IPV4、IPV6或域名类型源站；</li>
<li>COS：COS源。</li>
<li>ORIGIN_GROUP：源站组类型源站。</li>
<li>AWS_S3：AWS S3对象存储源站。</li>
     * @param OriginType 源站类型，取值有：
<li>IP_DOMAIN：IPV4、IPV6或域名类型源站；</li>
<li>COS：COS源。</li>
<li>ORIGIN_GROUP：源站组类型源站。</li>
<li>AWS_S3：AWS S3对象存储源站。</li>
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get 源站地址，当OriginType参数指定为ORIGIN_GROUP时，该参数填写源站组ID，其他情况下填写源站地址。 
     * @return Origin 源站地址，当OriginType参数指定为ORIGIN_GROUP时，该参数填写源站组ID，其他情况下填写源站地址。
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set 源站地址，当OriginType参数指定为ORIGIN_GROUP时，该参数填写源站组ID，其他情况下填写源站地址。
     * @param Origin 源站地址，当OriginType参数指定为ORIGIN_GROUP时，该参数填写源站组ID，其他情况下填写源站地址。
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get 备用源站组ID，该参数在OriginType参数指定为ORIGIN_GROUP时生效，为空表示不使用备用源站。 
     * @return BackupOrigin 备用源站组ID，该参数在OriginType参数指定为ORIGIN_GROUP时生效，为空表示不使用备用源站。
     */
    public String getBackupOrigin() {
        return this.BackupOrigin;
    }

    /**
     * Set 备用源站组ID，该参数在OriginType参数指定为ORIGIN_GROUP时生效，为空表示不使用备用源站。
     * @param BackupOrigin 备用源站组ID，该参数在OriginType参数指定为ORIGIN_GROUP时生效，为空表示不使用备用源站。
     */
    public void setBackupOrigin(String BackupOrigin) {
        this.BackupOrigin = BackupOrigin;
    }

    /**
     * Get 主源源站组名称，当OriginType参数指定为ORIGIN_GROUP时该参数生效。 
     * @return OriginGroupName 主源源站组名称，当OriginType参数指定为ORIGIN_GROUP时该参数生效。
     */
    public String getOriginGroupName() {
        return this.OriginGroupName;
    }

    /**
     * Set 主源源站组名称，当OriginType参数指定为ORIGIN_GROUP时该参数生效。
     * @param OriginGroupName 主源源站组名称，当OriginType参数指定为ORIGIN_GROUP时该参数生效。
     */
    public void setOriginGroupName(String OriginGroupName) {
        this.OriginGroupName = OriginGroupName;
    }

    /**
     * Get 备用源站源站组名称，当OriginType参数指定为ORIGIN_GROUP，且用户指定了被用源站时该参数生效。 
     * @return BackOriginGroupName 备用源站源站组名称，当OriginType参数指定为ORIGIN_GROUP，且用户指定了被用源站时该参数生效。
     */
    public String getBackOriginGroupName() {
        return this.BackOriginGroupName;
    }

    /**
     * Set 备用源站源站组名称，当OriginType参数指定为ORIGIN_GROUP，且用户指定了被用源站时该参数生效。
     * @param BackOriginGroupName 备用源站源站组名称，当OriginType参数指定为ORIGIN_GROUP，且用户指定了被用源站时该参数生效。
     */
    public void setBackOriginGroupName(String BackOriginGroupName) {
        this.BackOriginGroupName = BackOriginGroupName;
    }

    /**
     * Get 指定是否允许访问私有对象存储源站。当源站类型OriginType=COS或AWS_S3时有效 取值有：
<li>on：使用私有鉴权；</li>
<li>off：不使用私有鉴权。</li>
不填写，默认值为off。 
     * @return PrivateAccess 指定是否允许访问私有对象存储源站。当源站类型OriginType=COS或AWS_S3时有效 取值有：
<li>on：使用私有鉴权；</li>
<li>off：不使用私有鉴权。</li>
不填写，默认值为off。
     */
    public String getPrivateAccess() {
        return this.PrivateAccess;
    }

    /**
     * Set 指定是否允许访问私有对象存储源站。当源站类型OriginType=COS或AWS_S3时有效 取值有：
<li>on：使用私有鉴权；</li>
<li>off：不使用私有鉴权。</li>
不填写，默认值为off。
     * @param PrivateAccess 指定是否允许访问私有对象存储源站。当源站类型OriginType=COS或AWS_S3时有效 取值有：
<li>on：使用私有鉴权；</li>
<li>off：不使用私有鉴权。</li>
不填写，默认值为off。
     */
    public void setPrivateAccess(String PrivateAccess) {
        this.PrivateAccess = PrivateAccess;
    }

    /**
     * Get 私有鉴权使用参数，当源站类型PrivateAccess=on时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateParameters 私有鉴权使用参数，当源站类型PrivateAccess=on时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrivateParameter [] getPrivateParameters() {
        return this.PrivateParameters;
    }

    /**
     * Set 私有鉴权使用参数，当源站类型PrivateAccess=on时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateParameters 私有鉴权使用参数，当源站类型PrivateAccess=on时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateParameters(PrivateParameter [] PrivateParameters) {
        this.PrivateParameters = PrivateParameters;
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

    }
}

