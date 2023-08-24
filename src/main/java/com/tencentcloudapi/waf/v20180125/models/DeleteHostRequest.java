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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteHostRequest extends AbstractModel{

    /**
    * 删除的域名列表
    */
    @SerializedName("HostsDel")
    @Expose
    private HostDel [] HostsDel;

    /**
     * Get 删除的域名列表 
     * @return HostsDel 删除的域名列表
     */
    public HostDel [] getHostsDel() {
        return this.HostsDel;
    }

    /**
     * Set 删除的域名列表
     * @param HostsDel 删除的域名列表
     */
    public void setHostsDel(HostDel [] HostsDel) {
        this.HostsDel = HostsDel;
    }

    public DeleteHostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteHostRequest(DeleteHostRequest source) {
        if (source.HostsDel != null) {
            this.HostsDel = new HostDel[source.HostsDel.length];
            for (int i = 0; i < source.HostsDel.length; i++) {
                this.HostsDel[i] = new HostDel(source.HostsDel[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "HostsDel.", this.HostsDel);

    }
}

