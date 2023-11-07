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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRocketMQMsgTraceResponse extends AbstractModel {

    /**
    * [
    {
        "Stage": "produce",
        "Data": {
            "ProducerName": "生产者名",
            "ProduceTime": "消息生产时间",
            "ProducerAddr": "客户端地址",
            "Duration": "耗时ms",
            "Status": "状态（0：成功，1：失败）"
        }
    },
    {
        "Stage": "persist",
        "Data": {
            "PersistTime": "存储时间",
            "Duration": "耗时ms",
            "Status": "状态（0：成功，1：失败）"
        }
    },
    {
        "Stage": "consume",
        "Data": {
            "TotalCount": 2,
            "RocketMqConsumeLogs": [
                {
                    "ConsumerGroup": "消费组",
                    "ConsumeModel": "消费模式",
                    "ConsumerAddr": "消费者地址",
                    "ConsumeTime": "推送时间",
                    "Status": "状态（0:已推送未确认, 2:已确认, 3:转入重试, 4:已重试未确认, 5:已转入死信队列）"
                },
                {
                    "ConsumerGroup": "消费组",
                    "ConsumeModel": "消费模式",
                    "ConsumerAddr": "消费者地址",
                    "ConsumeTime": "推送时间",
                    "Status": "状态（0:已推送未确认, 2:已确认, 3:转入重试, 4:已重试未确认, 5:已转入死信队列）"
                }
            ]    
        }
    }
]
    */
    @SerializedName("Result")
    @Expose
    private TraceResult [] Result;

    /**
    * 消息轨迹页展示的topic名称
    */
    @SerializedName("ShowTopicName")
    @Expose
    private String ShowTopicName;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get [
    {
        "Stage": "produce",
        "Data": {
            "ProducerName": "生产者名",
            "ProduceTime": "消息生产时间",
            "ProducerAddr": "客户端地址",
            "Duration": "耗时ms",
            "Status": "状态（0：成功，1：失败）"
        }
    },
    {
        "Stage": "persist",
        "Data": {
            "PersistTime": "存储时间",
            "Duration": "耗时ms",
            "Status": "状态（0：成功，1：失败）"
        }
    },
    {
        "Stage": "consume",
        "Data": {
            "TotalCount": 2,
            "RocketMqConsumeLogs": [
                {
                    "ConsumerGroup": "消费组",
                    "ConsumeModel": "消费模式",
                    "ConsumerAddr": "消费者地址",
                    "ConsumeTime": "推送时间",
                    "Status": "状态（0:已推送未确认, 2:已确认, 3:转入重试, 4:已重试未确认, 5:已转入死信队列）"
                },
                {
                    "ConsumerGroup": "消费组",
                    "ConsumeModel": "消费模式",
                    "ConsumerAddr": "消费者地址",
                    "ConsumeTime": "推送时间",
                    "Status": "状态（0:已推送未确认, 2:已确认, 3:转入重试, 4:已重试未确认, 5:已转入死信队列）"
                }
            ]    
        }
    }
] 
     * @return Result [
    {
        "Stage": "produce",
        "Data": {
            "ProducerName": "生产者名",
            "ProduceTime": "消息生产时间",
            "ProducerAddr": "客户端地址",
            "Duration": "耗时ms",
            "Status": "状态（0：成功，1：失败）"
        }
    },
    {
        "Stage": "persist",
        "Data": {
            "PersistTime": "存储时间",
            "Duration": "耗时ms",
            "Status": "状态（0：成功，1：失败）"
        }
    },
    {
        "Stage": "consume",
        "Data": {
            "TotalCount": 2,
            "RocketMqConsumeLogs": [
                {
                    "ConsumerGroup": "消费组",
                    "ConsumeModel": "消费模式",
                    "ConsumerAddr": "消费者地址",
                    "ConsumeTime": "推送时间",
                    "Status": "状态（0:已推送未确认, 2:已确认, 3:转入重试, 4:已重试未确认, 5:已转入死信队列）"
                },
                {
                    "ConsumerGroup": "消费组",
                    "ConsumeModel": "消费模式",
                    "ConsumerAddr": "消费者地址",
                    "ConsumeTime": "推送时间",
                    "Status": "状态（0:已推送未确认, 2:已确认, 3:转入重试, 4:已重试未确认, 5:已转入死信队列）"
                }
            ]    
        }
    }
]
     */
    public TraceResult [] getResult() {
        return this.Result;
    }

    /**
     * Set [
    {
        "Stage": "produce",
        "Data": {
            "ProducerName": "生产者名",
            "ProduceTime": "消息生产时间",
            "ProducerAddr": "客户端地址",
            "Duration": "耗时ms",
            "Status": "状态（0：成功，1：失败）"
        }
    },
    {
        "Stage": "persist",
        "Data": {
            "PersistTime": "存储时间",
            "Duration": "耗时ms",
            "Status": "状态（0：成功，1：失败）"
        }
    },
    {
        "Stage": "consume",
        "Data": {
            "TotalCount": 2,
            "RocketMqConsumeLogs": [
                {
                    "ConsumerGroup": "消费组",
                    "ConsumeModel": "消费模式",
                    "ConsumerAddr": "消费者地址",
                    "ConsumeTime": "推送时间",
                    "Status": "状态（0:已推送未确认, 2:已确认, 3:转入重试, 4:已重试未确认, 5:已转入死信队列）"
                },
                {
                    "ConsumerGroup": "消费组",
                    "ConsumeModel": "消费模式",
                    "ConsumerAddr": "消费者地址",
                    "ConsumeTime": "推送时间",
                    "Status": "状态（0:已推送未确认, 2:已确认, 3:转入重试, 4:已重试未确认, 5:已转入死信队列）"
                }
            ]    
        }
    }
]
     * @param Result [
    {
        "Stage": "produce",
        "Data": {
            "ProducerName": "生产者名",
            "ProduceTime": "消息生产时间",
            "ProducerAddr": "客户端地址",
            "Duration": "耗时ms",
            "Status": "状态（0：成功，1：失败）"
        }
    },
    {
        "Stage": "persist",
        "Data": {
            "PersistTime": "存储时间",
            "Duration": "耗时ms",
            "Status": "状态（0：成功，1：失败）"
        }
    },
    {
        "Stage": "consume",
        "Data": {
            "TotalCount": 2,
            "RocketMqConsumeLogs": [
                {
                    "ConsumerGroup": "消费组",
                    "ConsumeModel": "消费模式",
                    "ConsumerAddr": "消费者地址",
                    "ConsumeTime": "推送时间",
                    "Status": "状态（0:已推送未确认, 2:已确认, 3:转入重试, 4:已重试未确认, 5:已转入死信队列）"
                },
                {
                    "ConsumerGroup": "消费组",
                    "ConsumeModel": "消费模式",
                    "ConsumerAddr": "消费者地址",
                    "ConsumeTime": "推送时间",
                    "Status": "状态（0:已推送未确认, 2:已确认, 3:转入重试, 4:已重试未确认, 5:已转入死信队列）"
                }
            ]    
        }
    }
]
     */
    public void setResult(TraceResult [] Result) {
        this.Result = Result;
    }

    /**
     * Get 消息轨迹页展示的topic名称 
     * @return ShowTopicName 消息轨迹页展示的topic名称
     */
    public String getShowTopicName() {
        return this.ShowTopicName;
    }

    /**
     * Set 消息轨迹页展示的topic名称
     * @param ShowTopicName 消息轨迹页展示的topic名称
     */
    public void setShowTopicName(String ShowTopicName) {
        this.ShowTopicName = ShowTopicName;
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

    public DescribeRocketMQMsgTraceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQMsgTraceResponse(DescribeRocketMQMsgTraceResponse source) {
        if (source.Result != null) {
            this.Result = new TraceResult[source.Result.length];
            for (int i = 0; i < source.Result.length; i++) {
                this.Result[i] = new TraceResult(source.Result[i]);
            }
        }
        if (source.ShowTopicName != null) {
            this.ShowTopicName = new String(source.ShowTopicName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Result.", this.Result);
        this.setParamSimple(map, prefix + "ShowTopicName", this.ShowTopicName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

