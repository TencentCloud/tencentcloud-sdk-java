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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncFwOperateRequest extends AbstractModel{

    /**
    * 同步操作类型：Route，同步防火墙路由
    */
    @SerializedName("SyncType")
    @Expose
    private String SyncType;

    /**
    * 防火墙类型；nat,nat防火墙;ew,vpc间防火墙
    */
    @SerializedName("FwType")
    @Expose
    private String FwType;

    /**
     * Get 同步操作类型：Route，同步防火墙路由 
     * @return SyncType 同步操作类型：Route，同步防火墙路由
     */
    public String getSyncType() {
        return this.SyncType;
    }

    /**
     * Set 同步操作类型：Route，同步防火墙路由
     * @param SyncType 同步操作类型：Route，同步防火墙路由
     */
    public void setSyncType(String SyncType) {
        this.SyncType = SyncType;
    }

    /**
     * Get 防火墙类型；nat,nat防火墙;ew,vpc间防火墙 
     * @return FwType 防火墙类型；nat,nat防火墙;ew,vpc间防火墙
     */
    public String getFwType() {
        return this.FwType;
    }

    /**
     * Set 防火墙类型；nat,nat防火墙;ew,vpc间防火墙
     * @param FwType 防火墙类型；nat,nat防火墙;ew,vpc间防火墙
     */
    public void setFwType(String FwType) {
        this.FwType = FwType;
    }

    public SyncFwOperateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncFwOperateRequest(SyncFwOperateRequest source) {
        if (source.SyncType != null) {
            this.SyncType = new String(source.SyncType);
        }
        if (source.FwType != null) {
            this.FwType = new String(source.FwType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SyncType", this.SyncType);
        this.setParamSimple(map, prefix + "FwType", this.FwType);

    }
}

