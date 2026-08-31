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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerlessNodeNumSpec extends AbstractModel {

    /**
    * <p>最小节点数</p>
    */
    @SerializedName("MinNodeNum")
    @Expose
    private Long MinNodeNum;

    /**
    * <p>最大节点数</p>
    */
    @SerializedName("MaxNodeNum")
    @Expose
    private Long MaxNodeNum;

    /**
     * Get <p>最小节点数</p> 
     * @return MinNodeNum <p>最小节点数</p>
     */
    public Long getMinNodeNum() {
        return this.MinNodeNum;
    }

    /**
     * Set <p>最小节点数</p>
     * @param MinNodeNum <p>最小节点数</p>
     */
    public void setMinNodeNum(Long MinNodeNum) {
        this.MinNodeNum = MinNodeNum;
    }

    /**
     * Get <p>最大节点数</p> 
     * @return MaxNodeNum <p>最大节点数</p>
     */
    public Long getMaxNodeNum() {
        return this.MaxNodeNum;
    }

    /**
     * Set <p>最大节点数</p>
     * @param MaxNodeNum <p>最大节点数</p>
     */
    public void setMaxNodeNum(Long MaxNodeNum) {
        this.MaxNodeNum = MaxNodeNum;
    }

    public ServerlessNodeNumSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerlessNodeNumSpec(ServerlessNodeNumSpec source) {
        if (source.MinNodeNum != null) {
            this.MinNodeNum = new Long(source.MinNodeNum);
        }
        if (source.MaxNodeNum != null) {
            this.MaxNodeNum = new Long(source.MaxNodeNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinNodeNum", this.MinNodeNum);
        this.setParamSimple(map, prefix + "MaxNodeNum", this.MaxNodeNum);

    }
}

