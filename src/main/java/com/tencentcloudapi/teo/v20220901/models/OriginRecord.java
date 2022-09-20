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

public class OriginRecord extends AbstractModel{

    /**
    * 源站记录值，不包含端口信息，可以为：IPv4，IPv6，域名格式。
    */
    @SerializedName("Record")
    @Expose
    private String Record;

    /**
    * 源站记录ID。
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 源站端口，取值范围：[1-65535]。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 当源站配置类型ConfigurationType=weight时，表示权重。
不配置权重信息时，所有源站组记录统一填写为0或者不填写，表示多个源站轮询回源。
配置权重信息时，取值为[1-100]，多个源站权重总和应为100，表示多个源站按照权重回源。
当源站配置类型ConfigurationType=proto时，表示权重。
不配置权重信息时，所有源站组记录统一填写为0或者不填写，表示多个源站轮询回源。
配置权重信息时，取值为[1-100]，源站组内Proto相同的多个源站权重总和应为100，表示多个源站按照权重回源。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 当源站配置类型ConfigurationType=proto时，表示源站的协议类型，将按照客户端请求协议回到相应的源站，取值有：
<li>http：HTTP协议源站；</li>
<li>https：HTTPS协议源站。</li>
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
    * 当源站配置类型ConfigurationType=area时，表示区域，为空表示全部地区。取值为iso-3166中alpha-2编码或者大洲区域代码。大洲区域代码取值为：
<li>Asia：亚洲；</li>
<li>Europe：欧洲；</li>
<li>Africa：非洲；</li>
<li>Oceania：大洋洲；</li>
<li>Americas：美洲。</li>源站组记录中，至少需要有一项为全部地区。
    */
    @SerializedName("Area")
    @Expose
    private String [] Area;

    /**
    * 当源站类型OriginType=third_part时有效
是否私有鉴权，取值有：
<li>true：使用私有鉴权；</li>
<li>false：不使用私有鉴权。</li>不填写，默认值为：false。
    */
    @SerializedName("Private")
    @Expose
    private Boolean Private;

    /**
    * 当源站类型Private=true时有效，表示私有鉴权使用参数。
    */
    @SerializedName("PrivateParameters")
    @Expose
    private PrivateParameter [] PrivateParameters;

    /**
     * Get 源站记录值，不包含端口信息，可以为：IPv4，IPv6，域名格式。 
     * @return Record 源站记录值，不包含端口信息，可以为：IPv4，IPv6，域名格式。
     */
    public String getRecord() {
        return this.Record;
    }

    /**
     * Set 源站记录值，不包含端口信息，可以为：IPv4，IPv6，域名格式。
     * @param Record 源站记录值，不包含端口信息，可以为：IPv4，IPv6，域名格式。
     */
    public void setRecord(String Record) {
        this.Record = Record;
    }

    /**
     * Get 源站记录ID。 
     * @return RecordId 源站记录ID。
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 源站记录ID。
     * @param RecordId 源站记录ID。
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 源站端口，取值范围：[1-65535]。 
     * @return Port 源站端口，取值范围：[1-65535]。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 源站端口，取值范围：[1-65535]。
     * @param Port 源站端口，取值范围：[1-65535]。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 当源站配置类型ConfigurationType=weight时，表示权重。
不配置权重信息时，所有源站组记录统一填写为0或者不填写，表示多个源站轮询回源。
配置权重信息时，取值为[1-100]，多个源站权重总和应为100，表示多个源站按照权重回源。
当源站配置类型ConfigurationType=proto时，表示权重。
不配置权重信息时，所有源站组记录统一填写为0或者不填写，表示多个源站轮询回源。
配置权重信息时，取值为[1-100]，源站组内Proto相同的多个源站权重总和应为100，表示多个源站按照权重回源。 
     * @return Weight 当源站配置类型ConfigurationType=weight时，表示权重。
不配置权重信息时，所有源站组记录统一填写为0或者不填写，表示多个源站轮询回源。
配置权重信息时，取值为[1-100]，多个源站权重总和应为100，表示多个源站按照权重回源。
当源站配置类型ConfigurationType=proto时，表示权重。
不配置权重信息时，所有源站组记录统一填写为0或者不填写，表示多个源站轮询回源。
配置权重信息时，取值为[1-100]，源站组内Proto相同的多个源站权重总和应为100，表示多个源站按照权重回源。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 当源站配置类型ConfigurationType=weight时，表示权重。
不配置权重信息时，所有源站组记录统一填写为0或者不填写，表示多个源站轮询回源。
配置权重信息时，取值为[1-100]，多个源站权重总和应为100，表示多个源站按照权重回源。
当源站配置类型ConfigurationType=proto时，表示权重。
不配置权重信息时，所有源站组记录统一填写为0或者不填写，表示多个源站轮询回源。
配置权重信息时，取值为[1-100]，源站组内Proto相同的多个源站权重总和应为100，表示多个源站按照权重回源。
     * @param Weight 当源站配置类型ConfigurationType=weight时，表示权重。
不配置权重信息时，所有源站组记录统一填写为0或者不填写，表示多个源站轮询回源。
配置权重信息时，取值为[1-100]，多个源站权重总和应为100，表示多个源站按照权重回源。
当源站配置类型ConfigurationType=proto时，表示权重。
不配置权重信息时，所有源站组记录统一填写为0或者不填写，表示多个源站轮询回源。
配置权重信息时，取值为[1-100]，源站组内Proto相同的多个源站权重总和应为100，表示多个源站按照权重回源。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 当源站配置类型ConfigurationType=proto时，表示源站的协议类型，将按照客户端请求协议回到相应的源站，取值有：
<li>http：HTTP协议源站；</li>
<li>https：HTTPS协议源站。</li> 
     * @return Proto 当源站配置类型ConfigurationType=proto时，表示源站的协议类型，将按照客户端请求协议回到相应的源站，取值有：
<li>http：HTTP协议源站；</li>
<li>https：HTTPS协议源站。</li>
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set 当源站配置类型ConfigurationType=proto时，表示源站的协议类型，将按照客户端请求协议回到相应的源站，取值有：
<li>http：HTTP协议源站；</li>
<li>https：HTTPS协议源站。</li>
     * @param Proto 当源站配置类型ConfigurationType=proto时，表示源站的协议类型，将按照客户端请求协议回到相应的源站，取值有：
<li>http：HTTP协议源站；</li>
<li>https：HTTPS协议源站。</li>
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
    }

    /**
     * Get 当源站配置类型ConfigurationType=area时，表示区域，为空表示全部地区。取值为iso-3166中alpha-2编码或者大洲区域代码。大洲区域代码取值为：
<li>Asia：亚洲；</li>
<li>Europe：欧洲；</li>
<li>Africa：非洲；</li>
<li>Oceania：大洋洲；</li>
<li>Americas：美洲。</li>源站组记录中，至少需要有一项为全部地区。 
     * @return Area 当源站配置类型ConfigurationType=area时，表示区域，为空表示全部地区。取值为iso-3166中alpha-2编码或者大洲区域代码。大洲区域代码取值为：
<li>Asia：亚洲；</li>
<li>Europe：欧洲；</li>
<li>Africa：非洲；</li>
<li>Oceania：大洋洲；</li>
<li>Americas：美洲。</li>源站组记录中，至少需要有一项为全部地区。
     */
    public String [] getArea() {
        return this.Area;
    }

    /**
     * Set 当源站配置类型ConfigurationType=area时，表示区域，为空表示全部地区。取值为iso-3166中alpha-2编码或者大洲区域代码。大洲区域代码取值为：
<li>Asia：亚洲；</li>
<li>Europe：欧洲；</li>
<li>Africa：非洲；</li>
<li>Oceania：大洋洲；</li>
<li>Americas：美洲。</li>源站组记录中，至少需要有一项为全部地区。
     * @param Area 当源站配置类型ConfigurationType=area时，表示区域，为空表示全部地区。取值为iso-3166中alpha-2编码或者大洲区域代码。大洲区域代码取值为：
<li>Asia：亚洲；</li>
<li>Europe：欧洲；</li>
<li>Africa：非洲；</li>
<li>Oceania：大洋洲；</li>
<li>Americas：美洲。</li>源站组记录中，至少需要有一项为全部地区。
     */
    public void setArea(String [] Area) {
        this.Area = Area;
    }

    /**
     * Get 当源站类型OriginType=third_part时有效
是否私有鉴权，取值有：
<li>true：使用私有鉴权；</li>
<li>false：不使用私有鉴权。</li>不填写，默认值为：false。 
     * @return Private 当源站类型OriginType=third_part时有效
是否私有鉴权，取值有：
<li>true：使用私有鉴权；</li>
<li>false：不使用私有鉴权。</li>不填写，默认值为：false。
     */
    public Boolean getPrivate() {
        return this.Private;
    }

    /**
     * Set 当源站类型OriginType=third_part时有效
是否私有鉴权，取值有：
<li>true：使用私有鉴权；</li>
<li>false：不使用私有鉴权。</li>不填写，默认值为：false。
     * @param Private 当源站类型OriginType=third_part时有效
是否私有鉴权，取值有：
<li>true：使用私有鉴权；</li>
<li>false：不使用私有鉴权。</li>不填写，默认值为：false。
     */
    public void setPrivate(Boolean Private) {
        this.Private = Private;
    }

    /**
     * Get 当源站类型Private=true时有效，表示私有鉴权使用参数。 
     * @return PrivateParameters 当源站类型Private=true时有效，表示私有鉴权使用参数。
     */
    public PrivateParameter [] getPrivateParameters() {
        return this.PrivateParameters;
    }

    /**
     * Set 当源站类型Private=true时有效，表示私有鉴权使用参数。
     * @param PrivateParameters 当源站类型Private=true时有效，表示私有鉴权使用参数。
     */
    public void setPrivateParameters(PrivateParameter [] PrivateParameters) {
        this.PrivateParameters = PrivateParameters;
    }

    public OriginRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginRecord(OriginRecord source) {
        if (source.Record != null) {
            this.Record = new String(source.Record);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Proto != null) {
            this.Proto = new String(source.Proto);
        }
        if (source.Area != null) {
            this.Area = new String[source.Area.length];
            for (int i = 0; i < source.Area.length; i++) {
                this.Area[i] = new String(source.Area[i]);
            }
        }
        if (source.Private != null) {
            this.Private = new Boolean(source.Private);
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
        this.setParamSimple(map, prefix + "Record", this.Record);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Proto", this.Proto);
        this.setParamArraySimple(map, prefix + "Area.", this.Area);
        this.setParamSimple(map, prefix + "Private", this.Private);
        this.setParamArrayObj(map, prefix + "PrivateParameters.", this.PrivateParameters);

    }
}

