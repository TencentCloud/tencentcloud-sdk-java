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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetaDbInfo extends AbstractModel{

    /**
    * 元数据类型。
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * 统一元数据库实例ID。
    */
    @SerializedName("UnifyMetaInstanceId")
    @Expose
    private String UnifyMetaInstanceId;

    /**
    * 自建元数据库信息。
    */
    @SerializedName("MetaDBInfo")
    @Expose
    private CustomMetaInfo MetaDBInfo;

    /**
     * Get 元数据类型。 
     * @return MetaType 元数据类型。
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set 元数据类型。
     * @param MetaType 元数据类型。
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get 统一元数据库实例ID。 
     * @return UnifyMetaInstanceId 统一元数据库实例ID。
     */
    public String getUnifyMetaInstanceId() {
        return this.UnifyMetaInstanceId;
    }

    /**
     * Set 统一元数据库实例ID。
     * @param UnifyMetaInstanceId 统一元数据库实例ID。
     */
    public void setUnifyMetaInstanceId(String UnifyMetaInstanceId) {
        this.UnifyMetaInstanceId = UnifyMetaInstanceId;
    }

    /**
     * Get 自建元数据库信息。 
     * @return MetaDBInfo 自建元数据库信息。
     */
    public CustomMetaInfo getMetaDBInfo() {
        return this.MetaDBInfo;
    }

    /**
     * Set 自建元数据库信息。
     * @param MetaDBInfo 自建元数据库信息。
     */
    public void setMetaDBInfo(CustomMetaInfo MetaDBInfo) {
        this.MetaDBInfo = MetaDBInfo;
    }

    public MetaDbInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetaDbInfo(MetaDbInfo source) {
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
        if (source.UnifyMetaInstanceId != null) {
            this.UnifyMetaInstanceId = new String(source.UnifyMetaInstanceId);
        }
        if (source.MetaDBInfo != null) {
            this.MetaDBInfo = new CustomMetaInfo(source.MetaDBInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamSimple(map, prefix + "UnifyMetaInstanceId", this.UnifyMetaInstanceId);
        this.setParamObj(map, prefix + "MetaDBInfo.", this.MetaDBInfo);

    }
}

