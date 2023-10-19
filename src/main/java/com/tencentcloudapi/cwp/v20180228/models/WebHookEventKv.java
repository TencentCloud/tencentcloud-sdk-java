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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebHookEventKv extends AbstractModel {

    /**
    * 事件类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 事件内容
    */
    @SerializedName("ControlBit")
    @Expose
    private String ControlBit;

    /**
     * Get 事件类型 
     * @return Type 事件类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 事件类型
     * @param Type 事件类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 事件内容 
     * @return ControlBit 事件内容
     */
    public String getControlBit() {
        return this.ControlBit;
    }

    /**
     * Set 事件内容
     * @param ControlBit 事件内容
     */
    public void setControlBit(String ControlBit) {
        this.ControlBit = ControlBit;
    }

    public WebHookEventKv() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebHookEventKv(WebHookEventKv source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.ControlBit != null) {
            this.ControlBit = new String(source.ControlBit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ControlBit", this.ControlBit);

    }
}

