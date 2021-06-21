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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PortSegment extends AbstractModel{

    /**
    * 起始端口，取值1~65535
    */
    @SerializedName("BeginPort")
    @Expose
    private Long BeginPort;

    /**
    * 结束端口，取值1~65535，必须不小于起始端口
    */
    @SerializedName("EndPort")
    @Expose
    private Long EndPort;

    /**
     * Get 起始端口，取值1~65535 
     * @return BeginPort 起始端口，取值1~65535
     */
    public Long getBeginPort() {
        return this.BeginPort;
    }

    /**
     * Set 起始端口，取值1~65535
     * @param BeginPort 起始端口，取值1~65535
     */
    public void setBeginPort(Long BeginPort) {
        this.BeginPort = BeginPort;
    }

    /**
     * Get 结束端口，取值1~65535，必须不小于起始端口 
     * @return EndPort 结束端口，取值1~65535，必须不小于起始端口
     */
    public Long getEndPort() {
        return this.EndPort;
    }

    /**
     * Set 结束端口，取值1~65535，必须不小于起始端口
     * @param EndPort 结束端口，取值1~65535，必须不小于起始端口
     */
    public void setEndPort(Long EndPort) {
        this.EndPort = EndPort;
    }

    public PortSegment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PortSegment(PortSegment source) {
        if (source.BeginPort != null) {
            this.BeginPort = new Long(source.BeginPort);
        }
        if (source.EndPort != null) {
            this.EndPort = new Long(source.EndPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginPort", this.BeginPort);
        this.setParamSimple(map, prefix + "EndPort", this.EndPort);

    }
}

