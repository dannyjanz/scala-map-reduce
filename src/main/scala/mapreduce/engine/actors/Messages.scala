package mapreduce.engine.actors

import mapreduce.engine.EngineTypes.Mappings

object Messages {

  case class Execute[In](data: Seq[In])

  case class MappingWork[In](chunk: Seq[In])

  case class ReducingWork[K, V](data: Mappings[K, V])

  case class MappingResult[K, V](result: Mappings[K, V])

  case class ReducingResult[K, R](result: Map[K, R])

}
