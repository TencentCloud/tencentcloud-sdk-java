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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckForwardAuthRequest extends AbstractModel{

    /**
    * 控制台Skey
    */
    @SerializedName("Skey")
    @Expose
    private String Skey;

    /**
    * 队列类型 0.CMQ  1.Ckafka
    */
    @SerializedName("QueueType")
    @Expose
    private Long QueueType;

    /**
     * Get 控制台Skey 
     * @return Skey 控制台Skey
     */
    public String getSkey() {
        return this.Skey;
    }

    /**
     * Set 控制台Skey
     * @param Skey 控制台Skey
     */
    public void setSkey(String Skey) {
        this.Skey = Skey;
    }

    /**
     * Get 队列类型 0.CMQ  1.Ckafka 
     * @return QueueType 队列类型 0.CMQ  1.Ckafka
     */
    public Long getQueueType() {
        return this.QueueType;
    }

    /**
     * Set 队列类型 0.CMQ  1.Ckafka
     * @param QueueType 队列类型 0.CMQ  1.Ckafka
     */
    public void setQueueType(Long QueueType) {
        this.QueueType = QueueType;
    }

    public CheckForwardAuthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckForwardAuthRequest(CheckForwardAuthRequest source) {
        if (source.Skey != null) {
            this.Skey = new String(source.Skey);
        }
        if (source.QueueType != null) {
            this.QueueType = new Long(source.QueueType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Skey", this.Skey);
        this.setParamSimple(map, prefix + "QueueType", this.QueueType);

    }
}

