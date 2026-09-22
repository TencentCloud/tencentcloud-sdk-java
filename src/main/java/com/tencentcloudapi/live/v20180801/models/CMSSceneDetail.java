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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CMSSceneDetail extends AbstractModel {

    /**
    * <p>策略信息</p>
    */
    @SerializedName("BizInfos")
    @Expose
    private CMSBizInfo [] BizInfos;

    /**
    * <p>SceneID 。</p>
    */
    @SerializedName("SceneID")
    @Expose
    private String SceneID;

    /**
     * Get <p>策略信息</p> 
     * @return BizInfos <p>策略信息</p>
     */
    public CMSBizInfo [] getBizInfos() {
        return this.BizInfos;
    }

    /**
     * Set <p>策略信息</p>
     * @param BizInfos <p>策略信息</p>
     */
    public void setBizInfos(CMSBizInfo [] BizInfos) {
        this.BizInfos = BizInfos;
    }

    /**
     * Get <p>SceneID 。</p> 
     * @return SceneID <p>SceneID 。</p>
     */
    public String getSceneID() {
        return this.SceneID;
    }

    /**
     * Set <p>SceneID 。</p>
     * @param SceneID <p>SceneID 。</p>
     */
    public void setSceneID(String SceneID) {
        this.SceneID = SceneID;
    }

    public CMSSceneDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CMSSceneDetail(CMSSceneDetail source) {
        if (source.BizInfos != null) {
            this.BizInfos = new CMSBizInfo[source.BizInfos.length];
            for (int i = 0; i < source.BizInfos.length; i++) {
                this.BizInfos[i] = new CMSBizInfo(source.BizInfos[i]);
            }
        }
        if (source.SceneID != null) {
            this.SceneID = new String(source.SceneID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BizInfos.", this.BizInfos);
        this.setParamSimple(map, prefix + "SceneID", this.SceneID);

    }
}

