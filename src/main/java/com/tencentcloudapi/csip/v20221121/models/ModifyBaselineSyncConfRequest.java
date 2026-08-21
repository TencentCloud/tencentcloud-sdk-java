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

public class ModifyBaselineSyncConfRequest extends AbstractModel {

    /**
    * <p>待更新的基线同步配置。</p>
    */
    @SerializedName("SyncConf")
    @Expose
    private BaselineSyncConf SyncConf;

    /**
    * 集团账号场景下的成员账号 Appid 列表。非集团账号或仅查询当前账号时传空。
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>待更新的基线同步配置。</p> 
     * @return SyncConf <p>待更新的基线同步配置。</p>
     */
    public BaselineSyncConf getSyncConf() {
        return this.SyncConf;
    }

    /**
     * Set <p>待更新的基线同步配置。</p>
     * @param SyncConf <p>待更新的基线同步配置。</p>
     */
    public void setSyncConf(BaselineSyncConf SyncConf) {
        this.SyncConf = SyncConf;
    }

    /**
     * Get 集团账号场景下的成员账号 Appid 列表。非集团账号或仅查询当前账号时传空。 
     * @return MemberId 集团账号场景下的成员账号 Appid 列表。非集团账号或仅查询当前账号时传空。
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号场景下的成员账号 Appid 列表。非集团账号或仅查询当前账号时传空。
     * @param MemberId 集团账号场景下的成员账号 Appid 列表。非集团账号或仅查询当前账号时传空。
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public ModifyBaselineSyncConfRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBaselineSyncConfRequest(ModifyBaselineSyncConfRequest source) {
        if (source.SyncConf != null) {
            this.SyncConf = new BaselineSyncConf(source.SyncConf);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SyncConf.", this.SyncConf);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

