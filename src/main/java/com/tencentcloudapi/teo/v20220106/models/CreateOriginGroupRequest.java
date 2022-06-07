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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOriginGroupRequest extends AbstractModel{

    /**
    * 源站组名称
    */
    @SerializedName("OriginName")
    @Expose
    private String OriginName;

    /**
    * 配置类型，当OriginType=self 时，需要填写：
area: 按区域配置
weight: 按权重配置
当OriginType=third_party 时，不需要填写
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 源站记录
    */
    @SerializedName("Record")
    @Expose
    private OriginRecord [] Record;

    /**
    * 站点ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 源站类型
self：自有源站
third_party：第三方源站
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
     * Get 源站组名称 
     * @return OriginName 源站组名称
     */
    public String getOriginName() {
        return this.OriginName;
    }

    /**
     * Set 源站组名称
     * @param OriginName 源站组名称
     */
    public void setOriginName(String OriginName) {
        this.OriginName = OriginName;
    }

    /**
     * Get 配置类型，当OriginType=self 时，需要填写：
area: 按区域配置
weight: 按权重配置
当OriginType=third_party 时，不需要填写 
     * @return Type 配置类型，当OriginType=self 时，需要填写：
area: 按区域配置
weight: 按权重配置
当OriginType=third_party 时，不需要填写
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 配置类型，当OriginType=self 时，需要填写：
area: 按区域配置
weight: 按权重配置
当OriginType=third_party 时，不需要填写
     * @param Type 配置类型，当OriginType=self 时，需要填写：
area: 按区域配置
weight: 按权重配置
当OriginType=third_party 时，不需要填写
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 源站记录 
     * @return Record 源站记录
     */
    public OriginRecord [] getRecord() {
        return this.Record;
    }

    /**
     * Set 源站记录
     * @param Record 源站记录
     */
    public void setRecord(OriginRecord [] Record) {
        this.Record = Record;
    }

    /**
     * Get 站点ID 
     * @return ZoneId 站点ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID
     * @param ZoneId 站点ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 源站类型
self：自有源站
third_party：第三方源站 
     * @return OriginType 源站类型
self：自有源站
third_party：第三方源站
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set 源站类型
self：自有源站
third_party：第三方源站
     * @param OriginType 源站类型
self：自有源站
third_party：第三方源站
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    public CreateOriginGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOriginGroupRequest(CreateOriginGroupRequest source) {
        if (source.OriginName != null) {
            this.OriginName = new String(source.OriginName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Record != null) {
            this.Record = new OriginRecord[source.Record.length];
            for (int i = 0; i < source.Record.length; i++) {
                this.Record[i] = new OriginRecord(source.Record[i]);
            }
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginName", this.OriginName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Record.", this.Record);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);

    }
}

