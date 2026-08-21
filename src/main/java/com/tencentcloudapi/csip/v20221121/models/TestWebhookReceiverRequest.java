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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TestWebhookReceiverRequest extends AbstractModel {

    /**
    * <p>机器人配置ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>自定义测试内容（明文）。不传时使用系统默认测试样例<br>入参限制：长度 0-2048</p>
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
     * Get <p>机器人配置ID</p> 
     * @return ID <p>机器人配置ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>机器人配置ID</p>
     * @param ID <p>机器人配置ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>自定义测试内容（明文）。不传时使用系统默认测试样例<br>入参限制：长度 0-2048</p> 
     * @return Data <p>自定义测试内容（明文）。不传时使用系统默认测试样例<br>入参限制：长度 0-2048</p>
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set <p>自定义测试内容（明文）。不传时使用系统默认测试样例<br>入参限制：长度 0-2048</p>
     * @param Data <p>自定义测试内容（明文）。不传时使用系统默认测试样例<br>入参限制：长度 0-2048</p>
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    public TestWebhookReceiverRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TestWebhookReceiverRequest(TestWebhookReceiverRequest source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

