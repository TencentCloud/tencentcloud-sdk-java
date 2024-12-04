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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class XMagicSimpleInfo extends AbstractModel {

    /**
    * XMagic 的Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * XMagic 状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get XMagic 的Id 
     * @return Id XMagic 的Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set XMagic 的Id
     * @param Id XMagic 的Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get XMagic 状态 
     * @return Status XMagic 状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set XMagic 状态
     * @param Status XMagic 状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public XMagicSimpleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public XMagicSimpleInfo(XMagicSimpleInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

