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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TerminateWorkspacesRequest extends AbstractModel {

    /**
    * 工作空间ID
    */
    @SerializedName("SpaceIds")
    @Expose
    private String [] SpaceIds;

    /**
    * 释放空间挂载的包年包月数据盘。true表示销毁空间同时释放包年包月数据盘，false表示只销毁空间。
    */
    @SerializedName("ReleasePrepaidDataDisks")
    @Expose
    private Boolean ReleasePrepaidDataDisks;

    /**
     * Get 工作空间ID 
     * @return SpaceIds 工作空间ID
     */
    public String [] getSpaceIds() {
        return this.SpaceIds;
    }

    /**
     * Set 工作空间ID
     * @param SpaceIds 工作空间ID
     */
    public void setSpaceIds(String [] SpaceIds) {
        this.SpaceIds = SpaceIds;
    }

    /**
     * Get 释放空间挂载的包年包月数据盘。true表示销毁空间同时释放包年包月数据盘，false表示只销毁空间。 
     * @return ReleasePrepaidDataDisks 释放空间挂载的包年包月数据盘。true表示销毁空间同时释放包年包月数据盘，false表示只销毁空间。
     */
    public Boolean getReleasePrepaidDataDisks() {
        return this.ReleasePrepaidDataDisks;
    }

    /**
     * Set 释放空间挂载的包年包月数据盘。true表示销毁空间同时释放包年包月数据盘，false表示只销毁空间。
     * @param ReleasePrepaidDataDisks 释放空间挂载的包年包月数据盘。true表示销毁空间同时释放包年包月数据盘，false表示只销毁空间。
     */
    public void setReleasePrepaidDataDisks(Boolean ReleasePrepaidDataDisks) {
        this.ReleasePrepaidDataDisks = ReleasePrepaidDataDisks;
    }

    public TerminateWorkspacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerminateWorkspacesRequest(TerminateWorkspacesRequest source) {
        if (source.SpaceIds != null) {
            this.SpaceIds = new String[source.SpaceIds.length];
            for (int i = 0; i < source.SpaceIds.length; i++) {
                this.SpaceIds[i] = new String(source.SpaceIds[i]);
            }
        }
        if (source.ReleasePrepaidDataDisks != null) {
            this.ReleasePrepaidDataDisks = new Boolean(source.ReleasePrepaidDataDisks);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SpaceIds.", this.SpaceIds);
        this.setParamSimple(map, prefix + "ReleasePrepaidDataDisks", this.ReleasePrepaidDataDisks);

    }
}

