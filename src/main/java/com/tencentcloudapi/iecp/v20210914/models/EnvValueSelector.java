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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvValueSelector extends AbstractModel{

    /**
    * 健名
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 对象名
    */
    @SerializedName("ObjectName")
    @Expose
    private String ObjectName;

    /**
    * 对象值
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
     * Get 健名 
     * @return Key 健名
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 健名
     * @param Key 健名
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 对象名 
     * @return ObjectName 对象名
     */
    public String getObjectName() {
        return this.ObjectName;
    }

    /**
     * Set 对象名
     * @param ObjectName 对象名
     */
    public void setObjectName(String ObjectName) {
        this.ObjectName = ObjectName;
    }

    /**
     * Get 对象值 
     * @return ObjectType 对象值
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set 对象值
     * @param ObjectType 对象值
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    public EnvValueSelector() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvValueSelector(EnvValueSelector source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.ObjectName != null) {
            this.ObjectName = new String(source.ObjectName);
        }
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "ObjectName", this.ObjectName);
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);

    }
}

