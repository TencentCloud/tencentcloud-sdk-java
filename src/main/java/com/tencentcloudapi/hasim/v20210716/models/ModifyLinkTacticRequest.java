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
package com.tencentcloudapi.hasim.v20210716.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLinkTacticRequest extends AbstractModel{

    /**
    * 云兔ID
    */
    @SerializedName("LinkID")
    @Expose
    private Long LinkID;

    /**
    * 策略ID
    */
    @SerializedName("TacticID")
    @Expose
    private Long TacticID;

    /**
     * Get 云兔ID 
     * @return LinkID 云兔ID
     */
    public Long getLinkID() {
        return this.LinkID;
    }

    /**
     * Set 云兔ID
     * @param LinkID 云兔ID
     */
    public void setLinkID(Long LinkID) {
        this.LinkID = LinkID;
    }

    /**
     * Get 策略ID 
     * @return TacticID 策略ID
     */
    public Long getTacticID() {
        return this.TacticID;
    }

    /**
     * Set 策略ID
     * @param TacticID 策略ID
     */
    public void setTacticID(Long TacticID) {
        this.TacticID = TacticID;
    }

    public ModifyLinkTacticRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLinkTacticRequest(ModifyLinkTacticRequest source) {
        if (source.LinkID != null) {
            this.LinkID = new Long(source.LinkID);
        }
        if (source.TacticID != null) {
            this.TacticID = new Long(source.TacticID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LinkID", this.LinkID);
        this.setParamSimple(map, prefix + "TacticID", this.TacticID);

    }
}

