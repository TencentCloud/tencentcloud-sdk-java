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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcVideoTaskInputSubjectInfo extends AbstractModel {

    /**
    * <p>固定主体Id。</p><ul><li>Kling主体<strong>必选</strong>；</li><li>Vidu主体可选。</li></ul>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>固定名称。</p><ul><li>Vidu主体<strong>必选</strong>；</li><li>Kling主体可选。</li></ul>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get <p>固定主体Id。</p><ul><li>Kling主体<strong>必选</strong>；</li><li>Vidu主体可选。</li></ul> 
     * @return Id <p>固定主体Id。</p><ul><li>Kling主体<strong>必选</strong>；</li><li>Vidu主体可选。</li></ul>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>固定主体Id。</p><ul><li>Kling主体<strong>必选</strong>；</li><li>Vidu主体可选。</li></ul>
     * @param Id <p>固定主体Id。</p><ul><li>Kling主体<strong>必选</strong>；</li><li>Vidu主体可选。</li></ul>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>固定名称。</p><ul><li>Vidu主体<strong>必选</strong>；</li><li>Kling主体可选。</li></ul> 
     * @return Name <p>固定名称。</p><ul><li>Vidu主体<strong>必选</strong>；</li><li>Kling主体可选。</li></ul>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>固定名称。</p><ul><li>Vidu主体<strong>必选</strong>；</li><li>Kling主体可选。</li></ul>
     * @param Name <p>固定名称。</p><ul><li>Vidu主体<strong>必选</strong>；</li><li>Kling主体可选。</li></ul>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public AigcVideoTaskInputSubjectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoTaskInputSubjectInfo(AigcVideoTaskInputSubjectInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

