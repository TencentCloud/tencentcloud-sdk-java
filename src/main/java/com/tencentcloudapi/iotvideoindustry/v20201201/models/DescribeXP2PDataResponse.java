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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeXP2PDataResponse extends AbstractModel{

    /**
    * [log_time,cdn_bytes , p2p_bytes, online_people, stuck_times, stuck_people,request,request_success,request_fail,play_fail]
[时间戳,cdn流量(字节) , p2p流量(字节), 在线人数, 卡播次数, 卡播人数,起播请求次数,起播成功次数,起播失败次数,播放失败次数, pcdn cdn流量（字节), pcdn路由流量(字节), 上传流量(字节)]
[1481016480, 46118502414, 75144943171, 61691, 3853, 0,0,0,0,0, 0, 0, 0]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get [log_time,cdn_bytes , p2p_bytes, online_people, stuck_times, stuck_people,request,request_success,request_fail,play_fail]
[时间戳,cdn流量(字节) , p2p流量(字节), 在线人数, 卡播次数, 卡播人数,起播请求次数,起播成功次数,起播失败次数,播放失败次数, pcdn cdn流量（字节), pcdn路由流量(字节), 上传流量(字节)]
[1481016480, 46118502414, 75144943171, 61691, 3853, 0,0,0,0,0, 0, 0, 0]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data [log_time,cdn_bytes , p2p_bytes, online_people, stuck_times, stuck_people,request,request_success,request_fail,play_fail]
[时间戳,cdn流量(字节) , p2p流量(字节), 在线人数, 卡播次数, 卡播人数,起播请求次数,起播成功次数,起播失败次数,播放失败次数, pcdn cdn流量（字节), pcdn路由流量(字节), 上传流量(字节)]
[1481016480, 46118502414, 75144943171, 61691, 3853, 0,0,0,0,0, 0, 0, 0]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set [log_time,cdn_bytes , p2p_bytes, online_people, stuck_times, stuck_people,request,request_success,request_fail,play_fail]
[时间戳,cdn流量(字节) , p2p流量(字节), 在线人数, 卡播次数, 卡播人数,起播请求次数,起播成功次数,起播失败次数,播放失败次数, pcdn cdn流量（字节), pcdn路由流量(字节), 上传流量(字节)]
[1481016480, 46118502414, 75144943171, 61691, 3853, 0,0,0,0,0, 0, 0, 0]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data [log_time,cdn_bytes , p2p_bytes, online_people, stuck_times, stuck_people,request,request_success,request_fail,play_fail]
[时间戳,cdn流量(字节) , p2p流量(字节), 在线人数, 卡播次数, 卡播人数,起播请求次数,起播成功次数,起播失败次数,播放失败次数, pcdn cdn流量（字节), pcdn路由流量(字节), 上传流量(字节)]
[1481016480, 46118502414, 75144943171, 61691, 3853, 0,0,0,0,0, 0, 0, 0]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeXP2PDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeXP2PDataResponse(DescribeXP2PDataResponse source) {
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

