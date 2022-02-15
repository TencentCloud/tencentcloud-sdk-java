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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetDestroyModeCommandInput extends AbstractModel{

    /**
    * 销毁模式，取值有：
<li>Auto：房间没人时自动销毁</li>
<li>Expire：房间没人时过期自动销毁</li>
<li>Never：不自动销毁，需手动销毁</li>默认为：Auto。
    */
    @SerializedName("DestroyMode")
    @Expose
    private String DestroyMode;

    /**
    * 过期销毁时间，单位：秒，当DestroyMode取Expire时必填。
    */
    @SerializedName("DestroyExpireTime")
    @Expose
    private Long DestroyExpireTime;

    /**
     * Get 销毁模式，取值有：
<li>Auto：房间没人时自动销毁</li>
<li>Expire：房间没人时过期自动销毁</li>
<li>Never：不自动销毁，需手动销毁</li>默认为：Auto。 
     * @return DestroyMode 销毁模式，取值有：
<li>Auto：房间没人时自动销毁</li>
<li>Expire：房间没人时过期自动销毁</li>
<li>Never：不自动销毁，需手动销毁</li>默认为：Auto。
     */
    public String getDestroyMode() {
        return this.DestroyMode;
    }

    /**
     * Set 销毁模式，取值有：
<li>Auto：房间没人时自动销毁</li>
<li>Expire：房间没人时过期自动销毁</li>
<li>Never：不自动销毁，需手动销毁</li>默认为：Auto。
     * @param DestroyMode 销毁模式，取值有：
<li>Auto：房间没人时自动销毁</li>
<li>Expire：房间没人时过期自动销毁</li>
<li>Never：不自动销毁，需手动销毁</li>默认为：Auto。
     */
    public void setDestroyMode(String DestroyMode) {
        this.DestroyMode = DestroyMode;
    }

    /**
     * Get 过期销毁时间，单位：秒，当DestroyMode取Expire时必填。 
     * @return DestroyExpireTime 过期销毁时间，单位：秒，当DestroyMode取Expire时必填。
     */
    public Long getDestroyExpireTime() {
        return this.DestroyExpireTime;
    }

    /**
     * Set 过期销毁时间，单位：秒，当DestroyMode取Expire时必填。
     * @param DestroyExpireTime 过期销毁时间，单位：秒，当DestroyMode取Expire时必填。
     */
    public void setDestroyExpireTime(Long DestroyExpireTime) {
        this.DestroyExpireTime = DestroyExpireTime;
    }

    public SetDestroyModeCommandInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetDestroyModeCommandInput(SetDestroyModeCommandInput source) {
        if (source.DestroyMode != null) {
            this.DestroyMode = new String(source.DestroyMode);
        }
        if (source.DestroyExpireTime != null) {
            this.DestroyExpireTime = new Long(source.DestroyExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DestroyMode", this.DestroyMode);
        this.setParamSimple(map, prefix + "DestroyExpireTime", this.DestroyExpireTime);

    }
}

