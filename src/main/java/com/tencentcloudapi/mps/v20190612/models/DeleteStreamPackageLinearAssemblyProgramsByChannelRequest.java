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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteStreamPackageLinearAssemblyProgramsByChannelRequest extends AbstractModel {

    /**
    * <p>频道的ID</p>
    */
    @SerializedName("ChannelID")
    @Expose
    private String ChannelID;

    /**
    * <p>需要删除的Id数组</p>
    */
    @SerializedName("IDs")
    @Expose
    private String [] IDs;

    /**
     * Get <p>频道的ID</p> 
     * @return ChannelID <p>频道的ID</p>
     */
    public String getChannelID() {
        return this.ChannelID;
    }

    /**
     * Set <p>频道的ID</p>
     * @param ChannelID <p>频道的ID</p>
     */
    public void setChannelID(String ChannelID) {
        this.ChannelID = ChannelID;
    }

    /**
     * Get <p>需要删除的Id数组</p> 
     * @return IDs <p>需要删除的Id数组</p>
     */
    public String [] getIDs() {
        return this.IDs;
    }

    /**
     * Set <p>需要删除的Id数组</p>
     * @param IDs <p>需要删除的Id数组</p>
     */
    public void setIDs(String [] IDs) {
        this.IDs = IDs;
    }

    public DeleteStreamPackageLinearAssemblyProgramsByChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteStreamPackageLinearAssemblyProgramsByChannelRequest(DeleteStreamPackageLinearAssemblyProgramsByChannelRequest source) {
        if (source.ChannelID != null) {
            this.ChannelID = new String(source.ChannelID);
        }
        if (source.IDs != null) {
            this.IDs = new String[source.IDs.length];
            for (int i = 0; i < source.IDs.length; i++) {
                this.IDs[i] = new String(source.IDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelID", this.ChannelID);
        this.setParamArraySimple(map, prefix + "IDs.", this.IDs);

    }
}

